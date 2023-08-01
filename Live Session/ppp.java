// import java.util.Scanner;

public class ppp {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the number of rows: ");
        // int numRows = scanner.nextInt();

        // Upper half of the triangle
        for (int i = 1; i <= 5; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the triangle
        for (int i = 5 - 2; i >= 1; i -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // scanner.close();
    }
}