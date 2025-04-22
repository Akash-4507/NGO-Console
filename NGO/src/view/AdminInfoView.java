package view;

import Controller.AdminInfoController;
import Controller.AdminInfoControllerImpl;
import Repositories.AdminInfoDb;
import model.AdminInfo;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class AdminInfoView {

    private static final Scanner scanner = new Scanner(System.in);
    private static final AdminInfoController adminInfoController=new AdminInfoControllerImpl();

    public void addAdminInfoView() {
        System.out.println("Enter the info to admin");
        System.out.println("Enter the Info_name");
        String infName = scanner.nextLine();
        System.out.println("Enter the Info_email");
        String infoEmail = scanner.nextLine();
        System.out.println("Enter the Info_phone");
        String infoPhone = scanner.nextLine();
        System.out.println("Enter the Info_Content");
        String infoContent = scanner.nextLine();
        LocalDate date = LocalDate.now();
        AdminInfo adminInfo = new AdminInfo(infName, infoEmail, infoPhone, infoContent,date);
        String s=adminInfoController.addAdminInfo(adminInfo);
        System.out.println(s);
    }

    public void showAdminInfoView() {
        System.out.println("these are the admin Info ops");
        System.out.println("1. view the admin info");
        System.out.println("2. Delete the admin info");
        System.out.println("3. exit");


        while (true) {
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    List<AdminInfo> adminInfos = adminInfoController.getAllAdminInfo();
                    for (AdminInfo adminInfo : adminInfos) {
                        System.out.println(adminInfo);
                    }
                    break;
                case 2:
                    System.out.println("Delete the admin info id");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    String s = adminInfoController.deleteAdminInfo(id);
                    System.out.println(s);
                    break;
                case 3:
                    System.out.println("Going back....");
                    UserView userView = new UserView();
                    userView.adminView();
                    return;
            }
        }

    }
}
