// Parent class: Customer
class Customer {
    int cost = 40; // Default cost for the customer
    String items = "Tomatoes"; // Default item for the customer

    // Method to display purchase list
    void purchaseList() {
        System.out.println("Customer Purchase List:");
        System.out.println("Item: " + items);
        System.out.println("Cost: " + cost);
    }
}

// Child class: Mart inherits Customer
public class Task033 extends Customer {
    int cost = 30; // Default cost for the Mart class
    String items = "Onions"; // Default item for the Mart class

    // Method for billing functionality in Mart class
    void billing() {
        System.out.println("Mart Billing:");
        System.out.println("Item: " + items); // Prints child class variable
        System.out.println("Cost: " + cost);  // Prints child class variable
    }

    // Method to demonstrate access to parent and child variables
    void showItemsAndCosts() {
        System.out.println("Using super to access Parent Class Variables:");
        System.out.println("Item: " + this.items);         // Prints child class value
        System.out.println("Cost: " + this.cost);          // Prints child class value
        System.out.println("Super Item: " + super.items);  // Access parent class value
        System.out.println("Super Cost: " + super.cost);   // Access parent class value
    }

    // Main method: Entry point
    public static void main(String[] args) {
        Task033 mart = new Task033(); // Create instance of Mart

        // Call the instance method to show items and costs
        mart.showItemsAndCosts();

        System.out.println("%%%%%%%%%%%%%%");

        // Calling parent class method using super
        mart.purchaseList();
    }
}