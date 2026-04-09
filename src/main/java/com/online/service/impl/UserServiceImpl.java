package com.online.service.impl;

import com.online.Model.User;
import com.online.repository.UserRepository;
import com.online.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    @Override
    public Boolean addUser(User user) {
        return repository.save(user);
    }

    @Override
    public Boolean updateUser(User user) {
        return repository.updateUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        repository.deleteUser(id);
    }

    @Override
    public List<User> getUser() {
        return repository.getUser();
    }
}
