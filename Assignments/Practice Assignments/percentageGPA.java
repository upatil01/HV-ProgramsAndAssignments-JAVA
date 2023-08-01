import java.util.Scanner;
public class percentageGPA{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("EnterMarks Obtained by Student : ");
        double studentMark =Sc.nextDouble();
        
        System.out.println("Total Marks : ");
        int totalMark = Sc.nextInt();
       
        double percentage = (studentMark/totalMark) * 100;
        System.out.println("Percentage : " + percentage + "%");
        // System.out.print("Percentage : " + String.format("%.2f" + percentage) + "%");

        if(studentMark <= 59){
            System.out.println("Grade F" + " , GPA = 0.0");
        }else if(studentMark <= 69){
            System.out.println("Grade D" + " , GPA = 1.0");
        }else if(studentMark <= 79){
            System.out.println("Grade " + " , GPA = 2.0");
        }else if(studentMark <= 89){
            System.out.println("Grade B" + " , GPA = 3.0");
        }else{
            System.out.println("Grade A" + " , GPA = 4.0");
        }

        Sc.close();

    }
}