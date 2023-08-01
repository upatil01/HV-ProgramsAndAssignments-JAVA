public class switchcaseINJava {
    public static void main(String [] arg){
        int choice = 10;

        // 0- Exit the Menu
        // 1 - Print list of books
        // 2 - Print the amount of books
        // 3 - Print the charge
        // 4 - Please check the choice you have made
        
        switch (choice) {
            case 0:
            System.out.println("Exit the Menu");
             break;
            case 1:
            System.out.println("Print list of books");
             break;
             case 2:
            System.out.println("Print amount of books");
             break;
             case 3:
            System.out.println("Print the charge");
             break;
        
            default:
            System.out.println("Please the choice you have made");
                break;
        }

        
    }

 

}
