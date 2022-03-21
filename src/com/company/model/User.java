package com.company.model;

import com.company.Gender;

import java.util.Objects;

public class User {
    private int ID;
    private String name;
    private int age;
    private Gender gender;

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return ID == user.ID && age == user.age && Objects.equals(name, user.name) && gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, age, gender);
    }

    public User(int ID, String name, int age, Gender gender) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User[ " +
                "ID: " + ID +
                " name: " + name  +
                " age: " + age +
                " gender: " + gender +
                " ]";
    }
}
