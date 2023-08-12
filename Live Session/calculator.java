class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int substract(int a, int b, int c ) {
        return a - b - c;
    }
    public int multiply(int a ,int b, int c, int d){
        return a * b * c * d;
    }    
    public String add(String  A, String B) {
        return A + B;
    }
}
public class calculator{
    
    public static void main(String[] args) {
        Calculator Cali = new Calculator();
        System.out.println(Cali.add(a:67, b:45));
        System.out.println(Cali.substract(a:96, b:8, c:8));
        System.out.println(Cali.multiply(a:13, b:4, c:8, d:9));
        System.out.println(Cali.add(A:Ram, B:Krishna));
        
    }
}