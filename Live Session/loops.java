import java.util.Arrays;

public class loops {
    public static void main(String[] args) {
        // Write a Java program to check if an array contains a specific element.
        int[] arr = { 10,20,30,40,50,60};
        int search = 500;
        boolean flag = false;
        // for each loop
        for(int i:arr){
            if(i == search){
                System.out.println("Element Present");
                flag = true;
                break;
            }   

            // }else{
            //     System.out.println("No");
            // }
        }
        // System.out.println("No");

        if(flag ==false){
            System.out.println("No");
        }

        int[] numbers;
        // method 2-binary search
        // if the value is not present in the array it will give the index number in negative where the value can be inserted
        Arrays.sort(numbers);
        int index=Arrays.binarySearch(numbers, search);
        System.out.println(index);

        // Write a Java program to fill an array with a specific value.

        int [] arr ={};

        
    }
    
}
