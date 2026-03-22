package com.online.repository.Impl;

import com.online.Model.User;
import com.online.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
}
