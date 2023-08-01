import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FilewritingexcepHeader {
    public static void main(String[] args) {
        String f1 = "hellonew.csv";
        // boolean isHeaderWritten = false;

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f1, true));
            File f = new File(f1); 
            // will print from line number 2 if header is already present in the file
            if (f.length() == 0) {
                bw.newLine();
                bw.write("Name, Age, TotalMarks, Class");
            }
            //  if (!isHeaderWritten) {
            //     writer.write("Name, Age, Salary");
            //     writer.newLine();
            //     isHeaderWritten = true;
            // }

            bw.newLine();
            bw.write("Ajay, 27, 100, 10");
            bw.newLine();
            bw.write("Vijay, 28, 99, 10");
            bw.newLine();
            bw.write("Jai, 29, 50, 10");
            bw.close();
        }

        catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception 
        }
    }
}

boolean isHeaderWritten = false;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
         
            if (!isHeaderWritten) {
                writer.write("Name, Age, Salary");
                writer.newLine();
                isHeaderWritten = true;
            }