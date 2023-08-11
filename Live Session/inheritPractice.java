class parent {
    int num1;
    int num2;
    int num3;
    int num4;

    // constructor of parent
    public parent(int a, int b, int c, int d) {
        this.num1 = a; // this keyword is used for dynamic binding.
        this.num2 = b;
        this.num3 = c;
        this.num4 = d;
    }
}

class child extends parent {
    int num5;

    public child(int a, int b, int c, int d, int e) {
        super(a, b, c, d);
        this.num5 = e;
    }
}

public class inheritPractice {
    public static void main(String[] args) {

        // object of parent class
        parent obj1 = new parent(2, 4, 7, 8);
        parent obj2 = new parent(4, 6, 7, 4);
        System.out.println(obj1.num2);
        System.out.println(obj2.num2);

        //// object of child class
        child c1 = new child(1, 2, 3, 4, 9);
        System.out.println(c1.num5);
    }
}

// constructor is a method which initialize the object.
// constructor is always public
// constructor will NOT return anything.
// It should have the same name as parent class.