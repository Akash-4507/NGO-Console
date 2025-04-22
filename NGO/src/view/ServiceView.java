package view;

import Controller.ServiceController;
import Controller.ServiceControllerImpl;
import model.Service;

import java.util.List;
import java.util.Scanner;

public class ServiceView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ServiceController serviceController = new ServiceControllerImpl();

    public void serviceOptionView() {
        while (true) {
            System.out.println("\nService Management Options:");
            System.out.println("1. Add Service");
            System.out.println("2. View All Services");
            System.out.println("3. Update Service by ID");
            System.out.println("4. Delete Service by ID");
            System.out.println("5. Go Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addService();
                    break;
                case 2:
                    viewAllServices();
                    break;
                case 3:
                    updateServiceById();
                    break;
                case 4:
                    deleteServiceById();
                    break;
                case 5:
                    System.out.println("Returning to Main Menu...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void addService() {
        System.out.println("\nEnter Service Details:");

        String serviceName;
        while (true) {
            System.out.print("Service Name: ");
            serviceName = scanner.nextLine().trim();
            if (serviceName.length() >= 5) {
                break;
            }
            System.out.println("Error: Service Name must be at least 5 characters long. Please try again.");
        }
        System.out.println("\nEnter Service Description:");
        String serviceDescription = scanner.nextLine();

        String serviceStatus;
        while (true) {
            System.out.print("Status: ");
            serviceStatus = scanner.nextLine().trim();
            if (serviceStatus.equalsIgnoreCase("Active") || serviceStatus.equalsIgnoreCase("Inactive")) {
                break;
            }
            System.out.println("Error: Status must be either 'Active' or 'Inactive'. Please try again.");
        }
        System.out.println("\nEnter ServiceType:");
        String serviceType = scanner.nextLine();
        System.out.println("Enter Service Impact");
        String serviceImpact = scanner.nextLine();

        Service newService = new Service(serviceName, serviceDescription, serviceStatus, serviceType, serviceImpact);
        String addedResponse = serviceController.addService(newService);
        System.out.println(addedResponse);
    }


    public void viewAllServices() {
        List<Service> services = serviceController.getServices();
        if (services.isEmpty()) {
            System.out.println("No services found.");
            return;
        }
        for (Service service : services) {
            System.out.println(service);
        }
    }

    public void updateServiceById() {
        System.out.print("\nEnter Service ID to Update: ");
        int serviceId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("New Service Name: ");
        String serviceName = scanner.nextLine();
        System.out.print("New Description: ");
        String serviceDescription = scanner.nextLine();
        System.out.print("New Status (Active/Inactive): ");
        String serviceStatus = scanner.nextLine();
        System.out.print("New Type: ");
        String serviceType = scanner.nextLine();
        System.out.print("New Impact: ");
        String serviceImpact = scanner.nextLine();

      //  Service updatedService = new Service(serviceName, serviceDescription, serviceStatus, serviceType, serviceImpact);
        String updateResponse = serviceController.editService(serviceId, serviceName,serviceDescription,serviceStatus,serviceType,serviceImpact);
        System.out.println(updateResponse);
    }

    public void deleteServiceById() {
        System.out.print("\nEnter Service ID to Delete: ");
        int serviceId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String deletedResponse = serviceController.deleteService(serviceId);
        System.out.println(deletedResponse);
    }
}
