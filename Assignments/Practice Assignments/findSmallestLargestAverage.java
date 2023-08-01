import java.util.Scanner;

public class findSmallestLargestAverage {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Please the first digit : ");
        int num1 = Sc.nextInt();

        System.out.println("Please enter the second digit : ");
        int num2 = Sc.nextInt();

        System.out.println("Please enter the third digit : ");
        int num3 = Sc.nextInt();

        // find smallest number
        if((num1 < num2) && (num1 < num3)){
            System.out.println(" The smallest number : " + num1);
        }else if((num2 < num3) && (num2 < num1)){
            System.out.println(" The smallest number : " + num2);
        }else{
            System.out.println(" The smallest number : " + num3);
        }

        if((num1 > num2) && (num1 > num3)){
            System.out.println(" The largest number : " + num1);
        }else if((num2 > num3) && (num2 > num1)){
            System.out.println(" The largest number : " + num2);
        }else{
            System.out.println(" The largest number : " + num3);           
        }

        int result = (num1 + num2 + num3) / 3;
        System.out.println(" Average of all three numbers : " + result);
        Sc.close();
        
    }
    
}
