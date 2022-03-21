package com.company;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Almaz", 20, Gender.MALE));
        users.add(new User(2, "Ulan", 19, Gender.MALE));
        users.add(new User(3, "Nurgazy", 26, Gender.MALE));
        users.add(new User(4, "nn", 26, Gender.MALE));
        UserDao userDao = new UserDao(users);
        UserServiceImpl userService = new UserServiceImpl(userDao);
        userService.findUserByID(users, 6);
        userService.gerAllUsers(users);
        userService.deleteUser(users, 6);
        userService.gerAllUsers(users);

    }
}
