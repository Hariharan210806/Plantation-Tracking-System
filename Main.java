import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Waste> wastes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Waste Management System =====");
            System.out.println("1. Add Waste");
            System.out.println("2. View All Waste");
            System.out.println("3. Search Waste");
            System.out.println("4. Update Waste");
            System.out.println("5. Delete Waste");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addWaste();
                    break;

                case 2:
                    viewWaste();
                    break;

                case 3:
                    searchWaste();
                    break;

                case 4:
                    updateWaste();
                    break;

                case 5:
                    deleteWaste();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    scanner.close();
                    return;

                default:
                   
                    System.out.println("Invalid choice! Please enter a number from 1
                                    to 6.");
                    System.out.println("Please try again.");
            }
            
        }
    }

    static void addWaste() {

        System.out.print("Enter Waste ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Waste Type: ");
        String type = scanner.nextLine();

        System.out.print("Enter Quantity (kg): ");
        double quantity = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Location: ");
        String location = scanner.nextLine();

        System.out.print("Enter Collection Date: ");
        String date = scanner.nextLine();

        Waste waste = new Waste(
                id,
                type,
                quantity,
                location,
                date
        );

        wastes.add(waste);

        System.out.println("Waste added successfully!");
    }

    static void viewWaste() {

        if (wastes.isEmpty()) {
            System.out.println("No waste records found.");
            return;
        }

        System.out.println("\n===== Waste Records =====");
System.out.println("Total Waste Records: " + wastes.size());
        for (Waste waste : wastes) {
            waste.displayWaste();
        }
    }

    static void searchWaste() {

        System.out.print("Enter Waste ID to search: ");
        int id = scanner.nextInt();

        for (Waste waste : wastes) {

            if (waste.getWasteId() == id) {
                System.out.println("\nWaste Found:");
                waste.displayWaste();
                return;
            }
        }

        System.out.println("Waste not found.");
    }

    static void updateWaste() {

        System.out.print("Enter Waste ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < wastes.size(); i++) {

            if (wastes.get(i).getWasteId() == id) {

                System.out.print("Enter New Waste Type: ");
                String type = scanner.nextLine();

                System.out.print("Enter New Quantity (kg): ");
                double quantity = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Enter New Location: ");
                String location = scanner.nextLine();

                System.out.print("Enter New Collection Date: ");
                String date = scanner.nextLine();

                Waste updatedWaste = new Waste(
                        id,
                        type,
                        quantity,
                        location,
                        date
                );

                wastes.set(i, updatedWaste);

                System.out.println("Waste updated successfully!");
                return;
            }
        }

        System.out.println("Waste not found.");
    }

    static void deleteWaste() {

        System.out.print("Enter Waste ID to delete: ");
        int id = scanner.nextInt();

        for (int i = 0; i < wastes.size(); i++) {

            if (wastes.get(i).getWasteId() == id) {

                wastes.remove(i);

                System.out.println("Waste deleted successfully!");
                return;
            }
        }

        System.out.println("Waste not found.");
    }
}
