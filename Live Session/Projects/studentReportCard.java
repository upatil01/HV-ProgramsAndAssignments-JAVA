import java.io.BufferedReader;
import java.io.FileReader;
public class studentReportCard {
    public static void main(String[] args) {
        // bufferedReader 
        try{
        BufferedReader br = new BufferedReader(new FileReader("student.csv"));
        String line;
        
        System.out.println(" REPORT CARD ");
        System.out.println("****************************************");
        br.readLine();

        while((line=br.readLine())!=null){
            String[] data = line.split(",");
            String name = data[0];
            String Subject1Name = data[1];
            int Subject1Marks = Integer.parseInt(data[2]);
            String Subject2Name = data[3];
            int Subject2Marks = Integer.parseInt(data[4]);
            String Subject3Name = data[5];
            int Subject3Marks = Integer.parseInt(data[6]);
            String teacherFeedback = data[7];
            int totalMarks = Subject1Marks + Subject2Marks + Subject3Marks;
            double avgMarks = totalMarks/3;
            double percentage = ((double)totalMarks / 300) * 100;

            // Grade of the students
            String grade;
            switch ((int)percentage) {
                case  90:
                  grade = "A+";
                    
                   break;
                case  80:
                grade = "A";
                    
                    break;
                case  70:
                grade = "B";
                    
                    break;
                case  60:
                grade = "C";
                    
                    break;
                           
                default:
                grade = "F";
                    
            }
                    
            System.out.println("Name : " + name);            
            System.out.println("Marks " + Subject1Name + ": " + Subject1Marks);
            System.out.println("Marks " + Subject2Name + ": " + Subject2Marks);
            System.out.println("Marks " + Subject3Name + ": " + Subject3Marks);
            System.out.println("Total Marks : " + totalMarks);
            System.out.println("Average Marks : " + avgMarks);
            System.out.println("Percentage : " + percentage);
            System.out.println("Grade : " + grade);
            System.out.println("Teacher Feedback : " + teacherFeedback);
            System.out.println("*************************");        
             
        }
        br.close();
    }
        catch(Exception e){
            e.printStackTrace();
        } 
                     
    }   
}



// if (percentage >= 90) {
//                         grade = "A+";
//                     } else if (percentage>= 80) {
//                         grade = "A";
//                     } else if (percentage >= 70) {
//                         grade = "B";
//                     } else if (percentage >= 60) {
//                         grade = "C";
//                     } else {
//                         grade = "F";
//                     }