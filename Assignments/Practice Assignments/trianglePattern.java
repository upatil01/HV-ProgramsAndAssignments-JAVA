public class trianglePattern {
    public static void main(String[] args) {
      
        // upper halt triangle
        for(int i = 1; i <=5; i+= 2){
            for(int j =1; j <= i ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower triangle 
        for(int i = 5-2; i>=1;i-=2){
            for(int j=1; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
//    for (int i = 5 - 2; i >= 1; i -= 2) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
    

