package com.online.service;

import com.online.Model.User;

import java.util.List;

public interface UserService {
    Boolean addUser(User user);
    List<User> getUser();
}
