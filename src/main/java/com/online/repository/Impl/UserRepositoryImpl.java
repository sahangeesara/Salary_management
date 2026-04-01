package com.online.repository.Impl;

import com.online.Model.User;
import com.online.repository.UserRepository;
import com.online.util.Role;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {
    private final JdbcTemplate jdbcTemplate; 


    @Override
    public Boolean save(User userEntity) {
       String sql = """
        INSERT INTO users (username, email, password, role, enabled, created_at)
        VALUES (?, ?, ?, ?, ?, ?)
    """;

        return jdbcTemplate.update(sql,
                userEntity.getUsername(),
                userEntity.getEmail(),
                userEntity.getPassword(),
                userEntity.getRole().name(),
                userEntity.getEnabled(),
                userEntity.getCreatedAt()
        ) > 0;
    }

    @Override
    public List<User> getUser() {
        String sql = "SELECT * FROM users";

        return jdbcTemplate.query(sql, (rs, rowNum) -> new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                Role.valueOf(rs.getString("role"))
                ));
    }
}
