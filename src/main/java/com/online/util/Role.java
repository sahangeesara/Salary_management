package com.online.util;

public enum Role {
    ROLE_ADMIN,
    ROLE_USER,
    ROLE_MANAGER,
    ROLE_CHASER,
    ROLE_CHEF;

    public String authority(){
        return this.name();
    }
}
