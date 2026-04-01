package com.online.controller;

import com.online.Model.User;
import com.online.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
@CrossOrigin
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/signup")
    public Boolean signup(@RequestBody User user){
        return service.addUser(user);
    }

    @GetMapping("/get-all")
    public Iterable<User> getAll(){
        return service.getUser();
    }
}
