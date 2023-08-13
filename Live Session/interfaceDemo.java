interface shape{
    double calculateArea();
    double calculateVolume();
    String getName();
    void display();
}
class circle implements shape {
    double radius;
    private String name = "Circle";

    circle(double radius) {
        
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    public double calculateVolume() {
        return Math.PI * (radius * radius * radius);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Name : " + name);
    }

}

class square implements shape {
    double length;
    double side;
    private String name = "Sqaure";

    square(double length, double side) {
        
        this.length = length;
        this.side = side;
    }

    public double calculateArea() {
        return (length * length);
    }

    public double calculateVolume() {
        return (side * side * side);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Name : " + name);
    }

}
class triangle implements shape {
    double base;
    double height;
    private String name = "Sqaure";

    triangle(double base, double height) {
        
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 1/2 * (base * height);
    }

    public double calculateVolume() {
       return (base * height);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Name : " + name);
    }

}

public class shape {
    public static void main(String[] args) {
        circle c1 = new  circle(1.2);
        c1.displayName();
        System.out.println("Area: " + c1.calculateArea());
        System.out.println("Volume: " + c1.calculateVolume());
        
    }
}