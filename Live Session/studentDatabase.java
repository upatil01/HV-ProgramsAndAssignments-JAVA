public class studentDatabase {
    public static void main(String[] args) {
        int[] studentID = {1,2,3,4};
        String[] studentName = {"Urvashi" , "Purva" , "Reema" , "Sunshine"};
        int[] studentMarks ={ 40,44,48,49};

        int length = studentID.length;
        for(int i = 0 ; i < length; i++){
            System.out.println(studentID[i] + ":" + studentName[i] + ":" + studentMarks[i]);

        }

    }
    
}
