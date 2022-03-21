package com.company.service;

import com.company.model.User;

import java.util.List;

public interface UserService  {
    void addUser(List<User> users, User user);

    void findUserByID(List<User> users, int id);

    void deleteUser(List<User> users, int id);

    void gerAllUsers(List<User> users);
    boolean exists(List<User> users, int id);


}
