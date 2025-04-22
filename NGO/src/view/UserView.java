package view;

import Controller.*;
import model.Blog;
import model.Donation;
import model.User;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class UserView {

    private static final Scanner scanner = new Scanner(System.in);
    private static final UserController userController=new UserControllerImpl();
    private static final ServiceController serviceController=new ServiceControllerImpl();
    private static final EventController eventController=new EventControllerImpl();
    private static final BlogController blogController=new BlogControllerImpl();
    private  static final DonationView donationView=new DonationView();

    public static void volunteerView() {
        while(true) {
            System.out.println("Welcome Volunteer");
            System.out.println("1. View Services");
            System.out.println("2. View Events");
            System.out.println("3. View Blogs");
            System.out.println("4. Make Donations");
            System.out.println("5. View Donations");
            System.out.println("6. Send a Info to Admin");
          //  System.out.println("7. See the Tasks/Works");
            System.out.println("7. Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    ServiceView serviceView = new ServiceView();
                    serviceView.viewAllServices();
                    break;
                case 2:
                    EventView eventView = new EventView();
                    eventView.viewAllEvents();
                    break;
                case 3:
                    BlogView blogView = new BlogView();
                    blogView.viewAllBlogs();
                    break;
                case 4:
                    DonationView donationView = new DonationView();
                    donationView.addDonation();
                    break;
                case 5:
                    DonationView donationView1 = new DonationView();
                    donationView1.viewDonations();
                    break;
                case 6:
                    AdminInfoView adminInfoView = new AdminInfoView();
                    adminInfoView.addAdminInfoView();
                    break;
                case 7:
                    return;
            }
        }
    }

    public String userAddView(){
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        User newUser=new User(username,password,email,"user");
       String s=  userController.addUser(newUser);
        return s;
    }
    public String userAdView(){
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter role: ");
        String role = scanner.nextLine();
        User newUser=new User(username,password,email,role);
        String st=  userController.addUser(newUser);
        return st;
    }

    public String getAllUserView(){
        List<User> allUsers=userController.getUsers();
        for(User user:allUsers){
            System.out.println(user);
        }
        return "These are all users! in NGO";
    }

    public String userGetLogin() {
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        return userController.authLogin(username,password);
    }

    public void adminView() {
        while (true) {
        System.out.println("Welcome back, Admin");
        System.out.println("Services offered to Admin:");
            System.out.println("Welcome back, Admin");
            System.out.println("Select a domain to manage:");

            System.out.println("1. Services");
            System.out.println("2. Events");
            System.out.println("3. Blogs");
            System.out.println("4. donation");
            System.out.println("5. Add a User");
            System.out.println("6. See the admin info");
            System.out.println("7. All users");
            System.out.println("8. Logout");



    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();
    scanner.nextLine();
    switch (choice) {

        case 1:
            ServiceView serviceView = new ServiceView();
            serviceView.serviceOptionView();
            break;
        case 2:
            EventView eventView = new EventView();
            eventView.eventOptionView();
            break;
        case 3:
            BlogView blogView = new BlogView();
            blogView.blogOptionView();
            break;
        case 4:
            DonationView donationView = new DonationView();
            donationView.donationOptionView();
            break;
        case 5:
            String r = userAdView();
            System.out.println(r);
            break;
        case 6:
            AdminInfoView adminInfoView = new AdminInfoView();
            adminInfoView.showAdminInfoView();
            break;
         case 7:
            List<User> users= userController.getUsers();
            for(User user:users){
                System.out.println(user);
            }
            break;
        case 8:
            return ;
    }
    System.out.print("Enter your choice: ");
}
    }

    public static void userView(){

            while(true)  {
                System.out.println("\nWelcome back, User!");
                System.out.println("Options:");
                System.out.println("1. View Services");
                System.out.println("2. View Events");
                System.out.println("3. View Blogs");
                System.out.println("4. Add a Blog");
                System.out.println("5. Make Donation");
                System.out.print("6. View Donation");
                System.out.print("7. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {

                    case 1:
                        serviceController.getServices();
                        break;
                    case 2:
                       eventController.getEvents();
                        break;
                    case 3:
                        List<Blog> blogs=blogController.getAllBlogs();
                        for(Blog blog:blogs){
                            System.out.println(blog);
                        }
                        break;
                    case 4: {
                        System.out.println("\nEnter Blog Details:");
                        System.out.print("Title: ");
                        String title = scanner.nextLine();
                        System.out.print("Author: ");
                        String author = scanner.nextLine();
                        System.out.print("Content: ");
                        String content = scanner.nextLine();
                        System.out.print("Description: ");
                        String description = scanner.nextLine();
                        LocalDate date = LocalDate.now();
                        Blog newBlog = new Blog(title, author, content, description, date);
                        String addedResponse = blogController.addBlog(newBlog);
                        System.out.println(addedResponse);
                        break;
                    }
                    case 5:
                        donationView.addDonation();
                        break;
                    case 6:
                        List<Donation> donations=donationView.viewDonations();
                        break;
                    case 7:
                        System.out.println("Exiting user panel...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

    }

}
