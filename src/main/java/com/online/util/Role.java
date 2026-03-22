package com.online.util;

public enum Role {
    ROLE_ADMIN,
    ROLE_USER,
    ROLE_MANAGER,
    ROLE_CASHIER,
    ROLE_CHEF;

    public String authority(){
        return this.name();
    }
}
