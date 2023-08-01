public class asterisksPattern{
    public static void main(String[] arg){
        for(int i = 5; i >=1 ;i -= 1){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
        for(int i = 1+1 ; i <=5 ; i +=1){
            for(int j = 1 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }   

    }
    
}