import java.util.*;

class EventManagementSystem1 {

    // Entry point of the application
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Event Management System");
        
        while (true) {
            System.out.println("Please select your role: ");
            System.out.println("1. Admin");
            System.out.println("2. Vendor");
            System.out.println("3. User");
            System.out.println("4. Exit");

            int choice = getValidIntInput(sc);
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
                case 4:
                    System.out.println("Exiting system.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int getValidIntInput(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input, please enter a number.");
            sc.next();
        }
        return sc.nextInt();
    }
}

// Admin class for admin-specific operations
class Admin {
    private Scanner sc = new Scanner(System.in);
    private Memberships memberships = new Memberships();
    private VendorManager vendorManager = new VendorManager();
    private UserManager userManager = new UserManager();

    public void adminMenu() {
        while (true) {
            System.out.println("Admin Menu:");
            System.out.println("1. Add/Update Memberships");
            System.out.println("2. Add/Update Vendor");
            System.out.println("3. Users Management");
            System.out.println("4. Vendor Management");
            System.out.println("5. Exit Admin Menu");

            int choice = getValidIntInput(sc);
            switch (choice) {
                case 1:
                    memberships.addUpdateMemberships();
                    break;
                case 2:
                    vendorManager.addUpdateVendor();
                    break;
                case 3:
                    userManager.manageUsers();
                    break;
                case 4:
                    vendorManager.manageVendors();
                    break;
                case 5:
                    System.out.println("Exiting Admin Menu.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private int getValidIntInput(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input, please enter a number.");
            sc.next();
        }
        return sc.nextInt();
    }
}

// Separate class for managing memberships
class Memberships {
    public void addUpdateMemberships() {
        System.out.println("Memberships have been added/updated.");
        // Logic for managing memberships can be added here
    }
}

// Separate class for managing users
class UserManager {
    public void manageUsers() {
        System.out.println("Managing users...");
        // Logic for managing users can be added here
    }
}

// VendorManager class for managing vendors
class VendorManager {
    public void addUpdateVendor() {
        System.out.println("Vendors have been added/updated.");
        // Logic for managing vendors can be added here
    }

    public void manageVendors() {
        System.out.println("Managing vendors...");
        // Logic for managing vendors can be added here
    }
}

// Vendor class for vendor-specific operations
class Vendor {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<String> items = new ArrayList<>();

    public void vendorMenu() {
        while (true) {
            System.out.println("Vendor Menu:");
            System.out.println("1. Manage Your Items");
            System.out.println("2. Add New Items");
            System.out.println("3. Transactions");
            System.out.println("4. Exit Vendor Menu");

            int choice = getValidIntInput(sc);
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
                case 4:
                    System.out.println("Exiting Vendor Menu.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private void manageItems() {
        System.out.println("1. View Items");
        System.out.println("2. Insert Item");
        System.out.println("3. Delete Item");

        int choice = getValidIntInput(sc);
        switch (choice) {
            case 1:
                System.out.println("Items: " + items);
                break;
            case 2:
                System.out.println("Enter item name:");
                String newItem = sc.next();
                items.add(newItem);
                System.out.println("Item inserted.");
                break;
            case 3:
                System.out.println("Enter item name to delete:");
                String deleteItem = sc.next();
                items.remove(deleteItem);
                System.out.println("Item deleted.");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    private void addNewItem() {
        System.out.println("Enter new item name:");
        String newItem = sc.next();
        items.add(newItem);
        System.out.println("New item added.");
    }

    private void viewTransactions() {
        System.out.println("Viewing all transactions...");
        // Logic for viewing transactions can be added here
    }

    private int getValidIntInput(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input, please enter a number.");
            sc.next();
        }
        return sc.nextInt();
    }
}

// User class for user-specific operations
class User {
    private Scanner sc = new Scanner(System.in);
    private Cart cart = new Cart();

    public void userMenu() {
        while (true) {
            System.out.println("User Menu:");
            System.out.println("1. Vendor Information");
            System.out.println("2. Cart");
            System.out.println("3. Guest List");
            System.out.println("4. Order Status");
            System.out.println("5. Exit User Menu");

            int choice = getValidIntInput(sc);
            switch (choice) {
                case 1:
                    viewVendors();
                    break;
                case 2:
                    cart.manageCart();
                    break;
                case 3:
                    manageGuestList();
                    break;
                case 4:
                    checkOrderStatus();
                    break;
                case 5:
                    System.out.println("Exiting User Menu.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private void viewVendors() {
        System.out.println("List of vendors...");
        // Logic for displaying vendors
    }

    private void manageGuestList() {
        System.out.println("1. Add guest");
        System.out.println("2. Delete guest");

        int choice = getValidIntInput(sc);
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
        // Logic for checking order status
    }

    private int getValidIntInput(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input, please enter a number.");
            sc.next();
        }
        return sc.nextInt();
    }
}

// Cart class for managing user cart
class Cart {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<String> items = new ArrayList<>();
    private double totalAmount = 0;

    public void manageCart() {
        System.out.println("1. Add item to cart");
        System.out.println("2. View total amount");
        System.out.println("3. Cancel order");

        int choice = getValidIntInput(sc);
        switch (choice) {
            case 1:
                System.out.println("Enter item name:");
                String item = sc.next();
                items.add(item);
                System.out.println("Enter item price:");
                totalAmount += sc.nextDouble();
                System.out.println("Item added to cart.");
                break;
            case 2:
                System.out.println("Total amount: $" + totalAmount);
                break;
            case 3:
                items.clear();
                totalAmount = 0;
                System.out.println("Order canceled.");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    private int getValidIntInput(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input, please enter a number.");
            sc.next();
        }
        return sc.nextInt();
    }
}
