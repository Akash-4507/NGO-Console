package Controller;

import model.User;

import java.util.List;

public interface UserController {
    List<User> getUsers();
    String addUser(User user);

    String authLogin(String username, String password);
}
