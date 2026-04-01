package com.online.repository;

import com.online.Model.User;

import java.util.List;

public interface UserRepository {
    Boolean save(User user);

    List<User> getUser();
}
