package view;

import Controller.EventController;
import Controller.EventControllerImpl;
import model.Event;

import java.util.List;
import java.util.Scanner;

public class EventView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final EventController eventController = new EventControllerImpl();

    public void eventOptionView() {
        while (true) {
            System.out.println("\nEvent Management Options:");
            System.out.println("1. Add Event");
            System.out.println("2. View All Events");
            System.out.println("3. Update Event by ID");
            System.out.println("4. Delete Event by ID");
            System.out.println("5. Go Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEvent();
                    break;
                case 2:
                    viewAllEvents();
                    break;
                case 3:
                    updateEventById();
                    break;
                case 4:
                    deleteEventById();
                    break;
                case 5:
                    System.out.println("Returning to Main Menu...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void addEvent() {
        System.out.println("\nEnter Event Details:");
        System.out.print("Event Name: ");
        String name = scanner.nextLine();
        System.out.print("Description: ");
        String description = scanner.nextLine();
        System.out.print("Location: ");
        String location = scanner.nextLine();
        System.out.print("Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Time (HH:MM): ");
        String time = scanner.nextLine();

        Event newEvent = new Event( name, description, location, date, time);
        String addedResponse=eventController.addEvent(newEvent);
        System.out.println(addedResponse);
    }

   public void viewAllEvents() {
        List<Event> events=eventController.getEvents();
        for (Event event : events) {
            System.out.println(event);
        }
    }

    public void updateEventById() {
        System.out.print("\nEnter Event ID to Update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("New Event Name: ");
        String name = scanner.nextLine();
        System.out.print("New Description: ");
        String description = scanner.nextLine();
        System.out.print("New Location: ");
        String location = scanner.nextLine();
        System.out.print("New Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("New Time (HH:MM): ");
        String time = scanner.nextLine();

      //  Event updatedEvent = new Event(name, description, location, date, time);
       String updateResponse= eventController.editEvent(id,name, description, location, date, time );
       System.out.println(updateResponse);
    }

  public void deleteEventById() {
        System.out.print("\nEnter Event ID to Delete: ");
        int id = scanner.nextInt();
        String deletedResponse=eventController.deleteEvent(id);
        System.out.println(deletedResponse);
    }
}
