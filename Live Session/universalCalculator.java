import java.util.Scanner;

public class universalCalculator {
    
    public static void main(String[] Args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println(" Welcome to Universal Calculator ");
        System.out.println("***********************************");

        //  take operation choices from user
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4.Division");
        System.out.println("5 Exit");

        int Choice = Sc.nextInt();

        if(Choice == 5){
            System.out.println(" Exiting the program ");
        }
        // taking values from the users
        System.out.println("Please enter the digit1 : ");
        double num1 = Sc.nextDouble();

        System.out.println("Please enter the digit2 : ");
        double num2 = Sc.nextDouble();

        double result = 0;

        switch (Choice) {
            case 1:
                result = num1 + num2;
                break;

            case 2:
                result = num1 - num2;
                break;  

            case 3:
                result = num1 * num2;
                break;

            case 4:
            if(num2 != 0){
                System.out.println(result = num1 / num2);
            }else{
                System.out.println("Error, you are dividing with zero");

            }            
                break;

            default:
                System.out.println("Invalid Choice");

                break;

        }
        System.out.println("Result :" + result);
        Sc.close();
    }
    
            
}

    


