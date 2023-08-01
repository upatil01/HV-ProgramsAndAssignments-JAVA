import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileReadingUsingScanner {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(new File("sample.txt"))) {
            while(Sc.hasNextLine()){
                String Line = Sc.nextLine();
                System.out.println(Line);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}

