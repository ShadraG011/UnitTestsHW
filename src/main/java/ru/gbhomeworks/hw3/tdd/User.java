package ru.gbhomeworks.hw3.tdd;

import java.util.Objects;

public class User {

    String name;
    String password;

    public boolean isAuthenticate = false;
    public boolean isAdmin = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        isAuthenticate = Objects.equals(this.name, name) &&
                Objects.equals(this.password, password);
        return isAuthenticate;
    }

}