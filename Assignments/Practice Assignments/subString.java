import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String stringName = Sc.nextLine();

        System.out.print("Enter the starting index: ");
        int startIndex = Sc.nextInt();

        System.out.print("Enter the ending index: ");
        int endIndex = Sc.nextInt();

        String substring = stringName.substring(startIndex, endIndex + 1);

        System.out.println("Substring of " + stringName + " from " + startIndex + " to " + endIndex + " is: " + substring);

        Sc.close();
    }
}