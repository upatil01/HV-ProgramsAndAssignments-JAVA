import java.io.FileWriter;

public class writingUsingStringWriter {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(" Hi , I am from FSD ").append(System.lineSeparator());
        sb.append(" I am from B11 ").append(System.lineSeparator());
        sb.append(" I am learning Java ").append(System.lineSeparator());
        try {
            FileWriter file = new FileWriter("data.csv");
            file.write(sb.toString());
            file.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
    
}
