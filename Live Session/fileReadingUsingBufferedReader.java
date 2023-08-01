import java.io.BufferedReader;
import java.io.FileReader;

public class fileReadingUsingBufferedReader {
    public static void main(String[] args) {
        // bufferedReader 
        try{
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        } br.close();
    }catch(Exception e){
        e.printStackTrace();
    } 
   
     
        
    }
    
}
