package com.tortoise.kob.controller.user;


import com.tortoise.kob.mapper.UserMapper;
import com.tortoise.kob.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/all")
    public List<User> getAllUser() {
        return userMapper.selectList(null);
    }

    @GetMapping("/user/{userId}/")
    public User getUser(@PathVariable int userId) {
        return userMapper.selectById(userId);
    }

    @GetMapping("/user/{userId}/{userName}/{userPassword}/")
    public String addUser(
            @PathVariable int userId,
            @PathVariable String userName,
            @PathVariable String userPassword
    ) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodePassword = passwordEncoder.encode(userPassword);
        User user = new User(userId, userName, encodePassword);
        userMapper.insert(user);
        return "Add User Successful";
    }
}
