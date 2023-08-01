import java.util.Scanner;
public class unitConversion{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String choice = "Y";

        System.out.println("Menu based app - Unit conversion for Distance");
        while(choice.equalsIgnoreCase("Y")){
            System.out.println("Enter your menu:");
            System.out.println("1. CM to M");
            System.out.println("2. M to KM");
            System.out.println("3. KM to M");
            System.out.println("4. M to CM");

            int menuChoice = Sc.nextInt();
            double value;

            switch (menuChoice) {
                case 1:
                    System.out.print("Please enter the CM Value: ");
                    value = Sc.nextDouble();
                    double meters = value / 100;
                    System.out.println(value + " CM = " + meters + " M");
                    break;

                case 2:
                    System.out.print("Please enter the M Value: ");
                    value = Sc.nextDouble();
                    double kilometers = value / 1000;
                    System.out.println(value + " M = " + kilometers + " KM");
                    break;

                case 3:
                    System.out.print("Please enter the KM Value: ");
                    value = Sc.nextDouble();
                    double meters2 = value * 1000;
                    System.out.println(value + " KM = " + meters2 + " M");
                    break;

                case 4:
                    System.out.print("Please enter the M Value: ");
                    value = Sc.nextDouble();
                    double centimeters = value * 100;
                    System.out.println(value + " M = " + centimeters + " CM");
                    break;

                default:
                    System.out.println("Invalid menu choice.");
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = Sc.next();
        }
        Sc.close();

    }
        
}
