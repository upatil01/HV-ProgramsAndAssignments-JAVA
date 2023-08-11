import java.util.Random;
import java.util.Scanner;

public class bankAccount {

    private String accNumber;
    private double accBalance;
    private String ownerName;

    public bankAccount(String ownerName) {
        this.ownerName = ownerName;
        this.accBalance = 0.0;
        this.accNumber = randomAccNumber();
    }

    public void depositeMoney(double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("Enter valid amount");
            return;
        }
        accBalance += depositAmount;
        System.out.println("Balance updated: " + accBalance);
    }

    public void withdrawMoney(double withAmount) {
        if (accBalance <= 0) {
            System.out.println("Enter valid amount");
            return;
        }
        if (withAmount > accBalance) {
            System.out.println("Insufficient balance..!!");
        }
        accBalance -= withAmount;
        System.out.println("Balance updated: " + accBalance);
    }

    public void displyOwnerDetails() {
        System.out.println("Owner name: " + ownerName);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Balance: " + accBalance);
    }

    private String randomAccNumber() {
        Random rnd = new Random();
        int number = rnd.nextInt(899999) + 100000;
        return String.valueOf(number);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter Account owner name: ");
        String name = Sc.next();

        bankAccount obj = new bankAccount(name);
        boolean exit = false;
        while (!exit) {
            System.out.println("=========Enter your choice========");
            System.out.println("1.Deposite Money");
            System.out.println("2.Withdraw Money");
            System.out.println("3.Display Owner details");
            System.out.println("4.Exit");

            System.out.println("Select any option from above: ");
            int option = Sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("How much you want to deposit: ");
                    double depositAmount = Sc.nextDouble();
                    obj.depositeMoney(depositAmount);
                    break;
                case 2:
                    System.out.println("How much you want to withdraw: ");
                    double withAmount = Sc.nextDouble();
                    obj.withdrawMoney(withAmount);
                    break;
                case 3:
                    obj.displyOwnerDetails();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice..!!");
                    break;
            }
        }
        Sc.close();
    }
}