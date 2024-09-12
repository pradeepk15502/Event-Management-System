import java.util.*;

class EventManagementSystem {

    // Entry point of the application
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Event Management System");
        System.out.println("Please select your role: ");
        System.out.println("1. Admin");
        System.out.println("2. Vendor");
        System.out.println("3. User");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Admin admin = new Admin();
                admin.adminMenu();
                break;
            case 2:
                Vendor vendor = new Vendor();
                vendor.vendorMenu();
                break;
            case 3:
                User user = new User();
                user.userMenu();
                break;
            default:
                System.out.println("Invalid choice. Exiting system.");
                break;
        }
    }
}

// Admin class for admin-specific operations
class Admin {
    Scanner sc = new Scanner(System.in);

    public void adminMenu() {
        System.out.println("Admin Menu");
        System.out.println("1. Add/Update Memberships");
        System.out.println("2. Add/Update Vendor");
        System.out.println("3. Users Management");
        System.out.println("4. Vendor Management");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                addUpdateMemberships();
                break;
            case 2:
                addUpdateVendor();
                break;
            case 3:
                manageUsers();
                break;
            case 4:
                manageVendors();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    private void addUpdateMemberships() {
        // Add logic to add or update memberships
        System.out.println("Memberships have been added/updated.");
    }

    private void addUpdateVendor() {
        // Add logic to add or update vendor
        System.out.println("Vendors have been added/updated.");
    }

    private void manageUsers() {
        // Logic to manage users
        System.out.println("User management complete.");
    }

    private void manageVendors() {
        // Logic to manage vendors
        System.out.println("Vendor management complete.");
    }
}

// Vendor class for vendor-specific operations
class Vendor {
    Scanner sc = new Scanner(System.in);

    public void vendorMenu() {
        System.out.println("Vendor Menu");
        System.out.println("1. Manage Your Items");
        System.out.println("2. Add New Items");
        System.out.println("3. Transactions");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                manageItems();
                break;
            case 2:
                addNewItem();
                break;
            case 3:
                viewTransactions();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    private void manageItems() {
        System.out.println("1. View Items");
        System.out.println("2. Insert Item");
        System.out.println("3. Delete Item");

        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Viewing all items...");
        } else if (choice == 2) {
            System.out.println("Item inserted.");
        } else if (choice == 3) {
            System.out.println("Item deleted.");
        } else {
            System.out.println("Invalid option.");
        }
    }

    private void addNewItem() {
        System.out.println("New item added to your list.");
    }

    private void viewTransactions() {
        System.out.println("Viewing all transactions...");
    }
}

// User class for user-specific operations
class User {
    Scanner sc = new Scanner(System.in);

    public void userMenu() {
        System.out.println("User Menu");
        System.out.println("1. Vendor Information");
        System.out.println("2. Cart");
        System.out.println("3. Guest List");
        System.out.println("4. Order Status");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                viewVendors();
                break;
            case 2:
                manageCart();
                break;
            case 3:
                manageGuestList();
                break;
            case 4:
                checkOrderStatus();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    private void viewVendors() {
        System.out.println("List of vendors...");
    }

    private void manageCart() {
        System.out.println("1. Add item to cart");
        System.out.println("2. View total amount");
        System.out.println("3. Cancel order");

        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Item added to cart.");
        } else if (choice == 2) {
            System.out.println("Total amount: $XXX");
        } else if (choice == 3) {
            System.out.println("Order canceled.");
        } else {
            System.out.println("Invalid option.");
        }
    }

    private void manageGuestList() {
        System.out.println("1. Add guest");
        System.out.println("2. Delete guest");

        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Guest added to the list.");
        } else if (choice == 2) {
            System.out.println("Guest removed from the list.");
        } else {
            System.out.println("Invalid option.");
        }
    }

    private void checkOrderStatus() {
        System.out.println("Order status: Pending");
    }
}
