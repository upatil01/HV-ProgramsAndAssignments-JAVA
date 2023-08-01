public class arraysINJava {
    public static void main(String[] args) {
        int[] studentID = {1,2,3,4,5};
        String[] studentName = {"Urvi" , "Purvi" , "Seema" , "Reema" , "Mina"};
     
        
    for(int i = 0 ; i < studentName.length ; i++){
        System.out.println(studentName[i]);

    }
    System.out.println();
    studentName[0] = "Urvashi";
    for(int i =0 ; i < studentName.length ; i++){
        System.out.println(studentName[i]);

    }
    System.out.println();
    int i =0;
    while(i < studentName.length){
        System.out.println(studentName[i]);
        i++;
    }
    System.out.println();
    for(int j=0; j < studentID.length ;j++){
        System.out.print(studentID[j]);

    }     
    }
    
}
