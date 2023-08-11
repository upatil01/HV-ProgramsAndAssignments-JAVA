public class classWithErrors {
  
    public void classWithError(){
        
        System.out.println("This is the constructor.");
    }

    
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    
    public int publicVariable = 10;

    
    public static void main(String[] args) {
        
        classWithErrors obj = new classWithErrors(); 
        obj.privateMethod(); 
    }
}
