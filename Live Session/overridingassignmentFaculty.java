public // //This Java program is a menu management system for a restaurant. 
// //It demonstrates object-oriented programming concepts such as inheritance, method overriding, and encapsulation to model a simple menu with dishes and beverages. The code is structured with base classes and subclasses to represent different types of menu items. 

// `MenuItem` class: 
// This is the base class for all menu items. 
// It encapsulates common properties such as the name and price of the item. 
// The `display()` method in this class provides a basic way to show item information.

// Dish class:
// A subclass of `MenuItem`, representing food dishes on the restaurant's menu. 
// It adds an extra property, `cuisineType`, to specify the type of cuisine the dish belongs 
// to. The `display()` method is overridden to provide detailed information about a dish, including its name, price, and cuisine type.

// Beverage class:
// Another subclass of `MenuItem`, representing beverages on the menu. 
// It includes a property `isAlcoholic` to indicate if the beverage is alcoholic or non-alcoholic. 
// The `display()` method in this class is also overridden to provide specific details about the beverage.

// The `overridingassignment` class serves as the entry point. 
// In the `main()` method, you can use the provided static methods in `Dish` and `Beverage` classes to create instances of these items and display their information using the `display()` method.
//  The goal of this code is to encourage understanding of inheritance and method overriding 
//  in a restaurant menu context.

class MenuItem {
    private String name;
    private double price;

    private MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Item: " + name + " | Price: $" + price);
    }
}

class dish extends MenuItem {
    private String cuisineType;
    // calling a constructor
    public dish(String name,double price, String cuisineType){
        super( name, price, cuisineType);
    
        // Hint: Call the constructor in the superclass
        this.cuisineType = cuisineType;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    @Override
    public void display() {
        // Hint: Customize the display for Dish
        System.out.println("Item: " + super.getName() +name + " | Price: $" + price +"Cusine Type : " + cuisineType);
    }

}

// creating a childclass of menuitem class
class Beverage extends MenuItem{
    private boolean isAlcoholic;

    private Beverage(String name, double price, boolean isAlcoholic) {
        super( name , price , isAlcoholic );
        // Hint: Call the constructor in the superclass
        this.isAlcoholic = isAlcoholic;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    @Override
    public void display() {
        // Hint: Customize the display for Beverage
        System.out.println(" ");
    }

}

public class overridingassignment {
    public static void main(String[] args) {
        // Hint: Use the static methods to create and display instances
        // System.out.println(" Welcome ");
    }
}
 {
    
}
