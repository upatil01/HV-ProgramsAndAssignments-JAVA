import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        // arr[3] = 40;
        System.out.println(arr[2]);
        int [] arr2 = {100,200,300};
        System.out.println(arr2[2]);

        String[] arr3Strings;
        arr3Strings = new String [2];
        arr3Strings[0] = "Urvi";
        arr3Strings[1] = "Purvi";
        // arr3Strings[2] = "Seemi";
        // System.out.println(arr3Strings[1]);

        
        // String[] arr4Strings;
        // String arr4Strings;
        // arr4Strings = {"P" , "u" ,"R"};
        // System.out.println(arr4Strings);

        for(int i = 0 ; i< arr.length; i++){
            // System.out.println(i);
            System.out.println(arr[i]);
        }
        // for each loop
        for(String i:arr3Strings){
            System.out.println(i);
        }

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
         
        // Write a Java program to check if an array contains a specific element.
        String str = "I am Urvashi";
        System.out.println(str.toCharArray());

    }
}