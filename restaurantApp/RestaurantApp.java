package RestaurantManagementProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantApp {
    public static Scanner sc = new Scanner(System.in);
    public static GetFileData getFileData = new GetFileData();

    public static boolean AdminLogin(String username, String password) {
        final String UserName = "Vaibhav";
        final String Password = "Vaibhav@123k";
        if (UserName.equals(username) && Password.equals(password)) {
            return true;
        } else {
            return false;
        }

    }

    public static void showMenuList() {

        boolean cont = true;
        while (cont) {
            System.out.println("1. All items");
            System.out.println("2. BreakFast");
            System.out.println("3. Veg");
            System.out.println("4. Non Veg");
            System.out.println("5. Cake");
            System.out.println("6. Juice");
            System.out.print("Enter your choice ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    getFileData.getCompleteMenu();
                    break;
                case 2:
                    getFileData.getBreakFastMenu();
                    break;
                case 3:
                    getFileData.getVegMenu();
                    break;
                case 4:
                    getFileData.getNonVegMenu();
                    break;
                case 5:
                    getFileData.getCakeMenu();
                    break;
                case 6:
                    getFileData.getJuiceMenu();
                    break;

                default:
                    cont = false;
                    break;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------\n"
                + "---------------@@ Quick-Bites Restaurant @@-------------\n"
                + "----------------------------------------------------------");
        String flag = "y";
        while (flag.equalsIgnoreCase("y")) {
            System.out.println("1. Admin ");
            System.out.println("2. User");
            System.out.print("Enter your choice :");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("------------------------------------------------------------------ -");
                    System.out.println("<----------------------@@ Admin Login Page @@---------------------->");
                    System.out.println("------------------------------------------------------------------ -");
                    // System.out.print("Enter UserName :");
                    // String username = sc.next();
                    // System.out.print("Enter Password :");
                    // String password = sc.next();
                    // boolean success = AdminLogin(username, password);
                    if (true) {
                        // getFileData.editMenuItem();
                        // System.out.println("Searching menu item");
                        // getFileData.findMenuItemByID();

                        // String[][] multiArray= getFileData.getFileDatainto2DArray();

                        // getFileData.getLastMenuItem();
                        // getFileData.findByID();
                        // showMenuList();
                    }
                    // } else {
                    // System.out.println("UserName or Password Invalid");
                    // }
                    break;
                case 2:

                    break;
                default:
                    System.out.println("exit loop");
                    flag = "N";
                    break;
            }

        }

    }

}
