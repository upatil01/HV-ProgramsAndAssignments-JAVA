import java.util.Scanner;
public class primeNumber{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Please enter a number = ");
        int num = Sc.nextInt();

        boolean isPrime = checkPrime(num);

        if(isPrime){
            System.out.println("The given number " + num + " is prime number.");
        }else{
            System.out.println("The given number " + num + " is odd number.");
        }
        Sc.close();
        
    }

    public static boolean checkPrime(int num) {
            if (num <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
    }

}







