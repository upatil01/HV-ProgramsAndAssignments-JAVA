
abstract class shape {
    String name;

    public shape(String name) {
        this.name = name;
    }

    abstract double calculateArea();

    abstract double calculateVolume();

    void displayName() {
        System.out.println("Name :" + name);
    }
}

class circle extends shape {
    double radius;

    circle(double radius) {
        super("circle");
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * (radius * radius);
    }

    double calculateVolume() {
        return Math.PI * (radius * radius * radius);
    }

}

class sqaure extends shape {
    double length;
    double side;

    sqaure(double length , double side) {
        super("sqaure");
        this.length = length;
        this.side = side;
    }

    double calculateArea() {
        return (length * length);
    }

    double calculateVolume() {
        return (side * side * side * side);
    }

}
class triangle extends shape {
    double base;
    double height;

    triangle(double base, double height) {
        super("triangle");
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 1/2 * (base * height);
    }

    double calculateVolume() {
        return (base * height);
    }

}

public class abstraction {
    public static void main(String[] args) {
        circle c1 = new  circle(1.2);
        c1.displayName();
        System.out.println("Area: " + c1.calculateArea());
        System.out.println("Volume: " + c1.calculateVolume());
        
    }
}