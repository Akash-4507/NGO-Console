package view;

import Controller.DonationController;
import Controller.DonationControllerImpl;
import model.Donation;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class DonationView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final DonationController donationController = new DonationControllerImpl();

    public void donationOptionView() {
        while (true) {
            System.out.println("\nDonation Management");
            System.out.println("1. Add Donation");
            System.out.println("2. View Donations");
            System.out.println("3. Delete Donation");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addDonation();
                    break;
                case 2:
                    viewDonations();
                    break;
                case 3:
                    deleteDonation();
                    break;

                case 4:
                    System.out.println("Exiting Donation Management...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

//    public void editDonation() {
//        System.out.println("\nEdit Donation");
//        System.out.println("Enter Donation id to delete");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Enter your name: ");
//        String donationName = scanner.nextLine();
//        System.out.println("Enter Donation description: ");
//        String donationDescription = scanner.nextLine();
//        System.out.println("Enter Donation date: ");
//        LocalDate date = LocalDate.now();
//        System.out.println("Enter Donation amount: ");
//        int donationAmount = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Enter Service name: ");
//        String donationType = scanner.nextLine();
//     //   Donation newDonation=new Donation(donationName,donationDescription,date,donationAmount,donationType);
//        String updatedRes=donationController.editDonation(id,donationName,donationDescription,date,donationAmount,donationType);
//        System.out.println(updatedRes);
//    }

    public void addDonation() {
        System.out.print("Enter Donor Name: ");
        String donorName = scanner.nextLine();

        System.out.print("Enter Donation Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter Donation Amount: ");
        int amount = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Service Name for Donation: ");
        String forServiceName = scanner.nextLine();

        Donation donation = new Donation(donorName, description,LocalDate.now(), amount, forServiceName);
        String response = donationController.makeDonation(donation);
        System.out.println(response);
    }

    public List<Donation> viewDonations() {
        List<Donation> donations = donationController.getDonations();
        if (donations.isEmpty()) {
            System.out.println("No donations found.");
        } else {
            System.out.println("\nDonation List:");
            for (Donation donation : donations) {
                System.out.println(donation);
            }
        }
        return donations;
    }

       public void deleteDonation() {
        System.out.print("Enter Donation ID to delete: ");
        int donationID = scanner.nextInt();
        scanner.nextLine();

        String response = donationController.deleteDonation(donationID);
        System.out.println(response);
    }
}
