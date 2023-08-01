import java.util.Scanner;

public class inputsFromUser {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        // System.out.println(" Please enter the digit :");
        // int tmpINT = Sc.nextInt();
        // System.out.println(" Please enter the digit :" + tmpINT);
        int[] studentID =new int [3];
        String[] studentName =new String [3];
        float [] studentGPA =new float [3];


        int i = 0;
        while( i < studentID.length){
            System.out.print("Please enter student ID " +i+ ":");
            studentID[i]= Sc.nextInt();
            i ++;
        }

        int j = 0;
        while( j < studentName.length){
            System.out.print("Please enter student Name " +j+ ":");
            studentName[j]= Sc.next();
            j ++;   
        }     

        int e = 0;
        while(e < studentGPA.length){
            System.out.print( "Please enter student Marks " +e+ ":");
            studentGPA[e]=Sc.nextFloat();
            e++;
        }    
        Sc.close();



    }

        // for(int i =0 ; i < studentID.length ; i++){
        //     System.out.println(studentID[i]);


        
} 
         
        

    

