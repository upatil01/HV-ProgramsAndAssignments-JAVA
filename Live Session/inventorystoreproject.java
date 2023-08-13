import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    // getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product(String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void display() {

        System.out.println("Name" + name + " | Price: " + price + "| Quantity: " + quantity);
    }

    public double calculateValue() {

        return price * quantity;

    }

    public void sell(int quantitySold) {

        if (quantitySold < quantity) {
            System.out.println("Total Quantity remaining : " + (quantity - quantitySold));
        } else {
            System.out.println("Not enough quantity to sell");
        }

    }

    public void applyDiscount(double discountPercentage) {

        double discount = price * (discountPercentage / 100);
        double newprice = price - discount;

        System.out.println("Price after the mentioned discount:  " + newprice);

    }

    public int compare(Product other) {
        if (this.price > other.price) {
            return 1;
        } else if (this.price < other.price) {
            return -1;
        } else {
            return Integer.compare(this.quantity, other.quantity);
        }
    }
     
    public boolean searchByName(String searchName) {

        return name.equalsIgnoreCase(searchName);

    }
}

class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, int quantity, String brand) {
        super(name, price, quantity);
        this.brand = brand;
    }

    @Override
    public void display() {

        System.out.println("Electronics:");
        System.out.println("Name: " + super.getName() + " | Price: " + super.getPrice() + "| Quantity: "
                + super.getQuantity() + "| Brand: " + brand);

    }
}

class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, int quantity, String size) {
        super(name, price, quantity);
        this.size = size;
    }

    @Override
    public void display() {

        System.out.println("Clothing:");
        System.out.println("Name: " + super.getName() + " | Price: " + super.getPrice() + "| Quantity: "
                + super.getQuantity() + "| Size: " + size);

    }
}

class Book extends Product {
    private String author;

    public Book(String name, double price, int quantity, String author) {
        super(name, price, quantity);
        this.author = author;
    }

    @Override
    public void display() {

        System.out.println("Books:");
        System.out.println("Name: " + super.getName() + " | Price: " + super.getPrice() + "| Quantity: "
                + super.getQuantity() + "| Author: " + author);

    }
}

public class inventorystoreproject {
    public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Input for the initial inventory
        System.out.println("Enter the initial inventory:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter product type (1: Electronics, 2: Clothing, 3: Book): ");
            int type = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter product name: ");
            String name = sc.nextLine();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            System.out.print("Enter product quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (type) {
                case 1:
                    System.out.print("Enter brand: ");
                    String brand = sc.nextLine();
                    inventory.add(new Electronics(name, price, quantity, brand));
                    break;
                case 2:
                    System.out.print("Enter size: ");
                    String size = sc.nextLine();
                    inventory.add(new Clothing(name, price, quantity, size));
                    break;
                case 3:
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    inventory.add(new Book(name, price, quantity, author));
                    break;
                default:
                    System.out.println("Invalid product type.");
            }
        }

        // Display the store inventory
        System.out.println("Store Inventory:");
        for (Product product : inventory) {
            product.display();
        }

        // Calculate and display total inventory value
        double totalValue = 0;
        for (Product product : inventory) {
            totalValue += product.calculateValue();
        }
        System.out.println("\nTotal Inventory Value: $" + totalValue);

        // Input for selling products
        System.out.println("\nEnter the product to sell:");
        System.out.print("Enter product name: ");
        String productName = sc.nextLine();
        System.out.print("Enter quantity to sell: ");
        int quantitySold = sc.nextInt();
        sc.nextLine(); // Consume newline

        boolean productFound = false;
        for (Product product : inventory) {
            if (product.searchByName(productName)) {
                productFound = true;
                product.sell(quantitySold);
                break;
            }
        }
        if (!productFound) {
            System.out.println("Product not found.");
        }
    }
}

// Display updated inventory



System.out.println("\nCompare Two Products:");
        if (inventory.size() >= 2) {
            Product product1 = inventory.get(0);
            Product product2 = inventory.get(1);

            int comparisonResult = product1.compare(product2);
            if (comparisonResult > 0) {
                System.out.println(product1.getName() + " is more expensive than " + product2.getName());
            } else if (comparisonResult < 0) {
                System.out.println(product1.getName() + " is cheaper than " + product2.getName());
            } else {
                System.out.println(product1.getName() + " has the same price as " + product2.getName());
            }
        } else {
            System.out.println("Not enough products to compare.");
        }