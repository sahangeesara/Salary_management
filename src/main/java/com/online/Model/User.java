package com.online.Model;

import com.online.util.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private Role role;
    private Boolean enabled;
    private LocalDateTime createdAt;

    public User(Long id,String username, String email,Boolean enabled ,Role role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.enabled = enabled;
        this.role = role;
    }
}
