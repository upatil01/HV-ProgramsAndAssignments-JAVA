import java.util.Scanner;

public class multiplicationtable{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // take input from user for num
        System.out.println("Please enter the number for multiplication table you want to print : ");

        int num = Sc.nextInt();
        for(int i = 1; i < 11; i++){
           int result = num * i;
            System.out.println(num + " x " + i + " = " + result );

        Sc.close();
        }
    }
}