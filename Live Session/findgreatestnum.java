public class findgreatestnum {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int c = 7;
        if(a < b){
            if(a < c){
                System.out.println("Greatest number is " + a);
            }else if(c < b){
                System.out.println("Greatest number is " + c);
                
            }
        
        }else if( b < c){
            System.out.println("Greatest number is " + b);

        }else if( c < a){
            System.out.println("Greatest number is " + c);
        }
        if((a>b) && (a>c)){
            System.out.println("Greatest number is " + a);
        }else if((b>a) && (b>c)){
            System.out.println("Greatest number is " + b);
        }else{
            System.out.println("Greatest number is " + c);
        }

    }
    
}
