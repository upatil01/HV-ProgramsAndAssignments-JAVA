import java.io.BufferedWriter;
import java.io.FileWriter;

public class fileWritingBufferedWriter {
    public static void main(String[] args) {
    try{
        BufferedWriter writer = new BufferedWriter(new FileWriter("student.csv" , true));
    //   BufferedWriter writer = new BufferedWriter(new FileWriter("studentfile.csv" , true));
      writer.write("name,Age,City");
      writer.newLine();
      writer.write("Urvashi,25,Chandrapur");
      writer.newLine();
      writer.close();
    }  
   
    catch (Exception e) {
        // TODO: handle exception
    }
    
    
}
}