package Controller;

import Repositories.UserDb;
import model.User;

import java.util.List;

public class UserControllerImpl implements UserController {

    UserDb userDb = new UserDb();

    @Override
    public List<User> getUsers() {
        return UserDb.getUsers();
    }

    @Override
    public String addUser(User user) {
        UserDb.addUserdb(user);
        return "User added";
    }

    @Override
    public String authLogin(String username, String password) {
        for(User user: UserDb.getUsers()){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user.getRole();
            }
        }
        return "Invalid username and password";
    }
}
