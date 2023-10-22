package ru.gbhomeworks.hw3.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    public List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (!user.isAuthenticate) return;
        data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void unLoginAllUsersExceptAdmin() {
        for (User user : data) {
            if (!user.isAdmin){
                user.isAuthenticate = false;
            }
        }
    }
}