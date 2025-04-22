package Repositories;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDb {
    private static final List<User> users = new ArrayList<User>();

    public static void addUserdb(User user) {
        users.add(user);
    }

    public static List<User> getUsers() {
        return users;
    }
}
