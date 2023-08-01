import java.util.Scanner;

public class swapTwoIntegers {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // ask user to enter the first digit
        System.out.println("Please enter the first digit : ");
        int numA = Sc.nextInt();
        
        // ask user to enter the first digit
        System.out.println("Please enter the second digit : ");
        int numB = Sc.nextInt();

        // swap the numA with the value of numB
        int numC = numA;
        numA = numB;
        numB = numC;

        // System.out.println("Swapped");
        System.out.println("numA = " + numA);
        System.out.println("numB = " + numB);


        Sc.close();
    }
    
}
