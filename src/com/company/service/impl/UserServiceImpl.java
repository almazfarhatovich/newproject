package com.company.service.impl;

import com.company.MyExeption;
import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao users;

    public UserServiceImpl(UserDao users) {
        this.users = users;
    }

    public UserDao getUsers() {
        return users;
    }

    public void setUsers(UserDao users) {
        this.users = users;
    }


    @Override
    public void addUser(List<User> users, User user) {
        users.add(user);
    }

    @Override
    public void findUserByID(List<User> users, int id) throws MyExeption {
        boolean a = exists(users, id);
        try {
            for (User user : users) {
                if (user.getID() == id) {
                    System.out.println(user);
                } else if (!a) {
                    throw new MyExeption("Мындай id жок");
                }
            }
        } catch (MyExeption e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void deleteUser(List<User> users, int id) {
        try {
            if (users.stream().filter(user -> user.getID() == id).findFirst().isEmpty()) {
                throw new MyExeption("user with id = " + id + " does not exists");
            }

            users.removeIf(user -> user.getID() == id);
        } catch (MyExeption exeption) {
            System.err.println(exeption.getMessage());
        }
    }

    @Override
    public void gerAllUsers(List<User> users) {
        users.forEach(System.out::println);
    }

    @Override
    public boolean exists(List<User> users, int id) {
        for (User s : users) {
            if (s.getID() == id) {
                return true;
            }
        }
        return false;
    }

}

