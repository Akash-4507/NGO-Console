import Controller.UserController;
import Controller.UserControllerImpl;
import model.User;
import view.UserView;

import java.util.Scanner;

import static view.UserView.*;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        UserView userView = new UserView();

        User user = new User("Akash","12345","akashanand9790@gmail.com","admin");
        UserController userController = new UserControllerImpl();
        userController.addUser(user);

        while(true) {
            System.out.println("Welcome to the NGO community");
            System.out.println("1 . Register a new user");
            System.out.println("2 . Login a new user");
         //\   System.out.println("3 . Exit");
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1: {
                    String s = userView.userAddView();
                    System.out.println(s);
                    break;
                }
                case 2: {
                    String s=userView.userGetLogin();
                    if(s.equals("admin")) {
                        userView.adminView();
                    }
                    else if(s.equals("user")) {
                        UserView.userView();
                    }
                    else if(s.equals("volunteer")) {
                        UserView.volunteerView();
                    }
                    break;
                }
                default: {
                    System.out.println("Wrong choice. Try again");
                    break;
                }
            }

        }


    }
}