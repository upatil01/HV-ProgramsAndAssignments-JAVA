import java.io.BufferedReader;
import java.io.FileReader;

public class csvFileReader {
    public static void main(String[] args) {
        try{
        BufferedReader br =new BufferedReader(new FileReader("details.csv"));
        String line;
        br.readLine();
        while ((line=br.readLine())!=null) {
        //    System.out.println(line);
        String[] data = line.split(",");
        String n = data[2];
        System.out.println(n); 
            
        }br.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}
// String age=arr[1];
//                 int age1=Integer.parseInt(age);
