import java.util.Scanner;

public class evenOddNum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String choice = "Y";

        System.out.println("Menu base app - EvenOdd checker");
       
        while(choice.equalsIgnoreCase("Y")){
                   
        System.out.println("Please enter a number : ");
        int num = Sc.nextInt();

        if(num % 2 ==0){
            System.out.println("The given number - " + num + " is an even number");
        }else{
            System.out.println("The given number - " + num + " is an odd number");
        }
        System.out.println("Do you want to continue (y/n)" );
            choice = Sc.next();
        }    

        
        Sc.close();
    }
}
    

