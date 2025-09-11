package Dmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DManager manager = DManager.getInstance();

        while (true) {
            System.out.println("\n--- DManager Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Show Items");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String input = sc.nextLine().trim(); // read input as string

            // Check for exit
            if (input.equalsIgnoreCase("exit") || input.equals("4")) {
                System.out.println("Exiting...");
                sc.close();
                return;
            }

            int choice;
            try {
                choice = Integer.parseInt(input); // convert string to number
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Enter a number (1-4) or 'exit'.");
                continue;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter item to add: ");
                    String addItem = sc.nextLine();
                    manager.addItem(addItem);
                }
                case 2 -> {
                    System.out.print("Enter item to remove: ");
                    String removeItem = sc.nextLine();
                    manager.removeItem(removeItem);
                }
                case 3 -> manager.listItems();
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
