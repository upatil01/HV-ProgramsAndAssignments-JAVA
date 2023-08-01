import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writingUsingBufferedWriter {
    public static void main(String[] args) {
        
        //Use bufferedWriter for writing a file
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("SampleWriteFile.csv", true)); //you just have to write true, it will automatically show fixed values.
            
            bw.write("Name,Age,TotalMarks,Class");
            bw.newLine();
            bw.write("Urvashi,27,500,FSD");
            bw.newLine();
            bw.write("Rajlakshmi,25,550,DS");
            bw.newLine();
            bw.write("Rakesh,29,450,DevOps");
            bw.newLine();
            bw.write("Sandesh,28,350,FSD");
            bw.newLine();
            bw.write("Shubham,32,250,HR");
            bw.newLine();


        bw.close();
        }catch (IOException e) {
            //Auto-generated catch block
            e.printStackTrace();
            System.out.println(e);
        }

    }
}
