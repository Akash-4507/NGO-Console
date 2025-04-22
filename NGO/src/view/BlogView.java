package view;

import Controller.BlogController;
import Controller.BlogControllerImpl;
import model.Blog;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class BlogView {
    private static final BlogController blogController= new BlogControllerImpl();
    private final Scanner scanner = new Scanner(System.in);

    public void blogOptionView() {
        while (true) {
            System.out.println("\nBlog Management Options:");
            System.out.println("1. Add Blog");
            System.out.println("2. View All Blogs");
            System.out.println("3. Update Blog by ID");
            System.out.println("4. Delete Blog by ID");
            System.out.println("5. Go Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBlog();
                    break;
                case 2:
                    viewAllBlogs();
                    break;
                case 3:
                    updateBlogById();
                    break;
                case 4:
                    deleteBlogById();
                    break;
                case 5:
                    System.out.println("Returning to Main Menu...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

   public void addBlog() {
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
       String addedResponse= blogController.addBlog(newBlog);
       System.out.println(addedResponse);
    }

    public void viewAllBlogs() {
        List<Blog> blogs=blogController.getAllBlogs();
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }

    public void updateBlogById() {
        System.out.print("\nEnter Blog ID to Update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("New Title: ");
        String title = scanner.nextLine();
        System.out.print("New Author: ");
        String author = scanner.nextLine();
        System.out.print("New Content: ");
        String content = scanner.nextLine();
        System.out.print("New Description: ");
        String description = scanner.nextLine();
        System.out.print("New Date: ");
        LocalDate date = LocalDate.now();
     //   Blog newBlog = new Blog(title, author, content, description, date);
       String updatedResponse= blogController.updateBlog(id,title, author, content, description, date);
       System.out.println(updatedResponse);
    }

    public void deleteBlogById() {
        System.out.print("\nEnter Blog ID to Delete: ");
        int id = scanner.nextInt();
       String deletedResponse= blogController.deleteBlog(id);
       System.out.println(deletedResponse);
    }

}
