class shape {    //this is super class
    public int numberofSides = 4;

    public void display() {
        System.out.println("this is a shape class");
    }
}

//this is child class
class circle22 extends shape {     
    int numberofSides = 5;

    public void display() {
        System.out.println("this is a circle class");
        System.out.println("Number of sides are: " + super.numberofSides);
    }

    public void details(){
        System.out.println("Details have been printed. ");
        super.display();

    }
}

public class inheritanceExample {
    public static void main(String[] args) {
        //object of circle
        circle22 c1 = new circle22();
        c1.display();
        c1.details();
        //object of shape
        shape s1 = new shape();
        s1.display();
        //c1.displaychild(); // parent can not access child's method but we can do vise versa.
        //c1.displayparent();
        
        System.out.println(c1.numberofSides); //print 5 due to overriding
    }
}

