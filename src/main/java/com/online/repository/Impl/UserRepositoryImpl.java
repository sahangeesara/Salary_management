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
    public Boolean updateUser(User userEntity) {
        String sql = """
            UPDATE users 
            SET username = ?, 
                email = ?, 
                password = CASE WHEN ? IS NOT NULL AND ? != '' THEN ? ELSE password END,
                role = COALESCE(?, role),
                enabled = ?
            WHERE id = ?
            """;

        // Handle the Role Enum to String conversion
        String roleStr = (userEntity.getRole() != null) ? userEntity.getRole().name() : null;

        return jdbcTemplate.update(sql,
                userEntity.getUsername(),
                userEntity.getEmail(),
                userEntity.getPassword(),
                userEntity.getPassword(),
                userEntity.getPassword(),
                roleStr,
                userEntity.getEnabled(),
                userEntity.getId()
        ) > 0;
    }

    @Override
    public void deleteUser(Long id) {
        String sql = "DELETE FROM users WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public List<User> getUser() {
        String sql = "SELECT * FROM users";

        return jdbcTemplate.query(sql, (rs, rowNum) -> new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getBoolean("enabled"),
                Role.valueOf(rs.getString("role"))
                ));
    }
}
