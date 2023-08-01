public class trunaryOperator{
    public static void main(String[] arg){
    //     int num1 = 10;
    //     int num2 = 20;
    //     // if(num1 < num2);
    //     // System.out.println("")
    // String checkGreaterNumber =(num1 < num2) ? ("Second number is grater " + num2) : ("First number is greater " + num1);
    // System.out.println(checkGreaterNumber);

    int num1 = 10;
    int num2 = 20;
    int num3 = 30;
    // String checkGreaterNumber = (num1 < num2) ? (num1 < num3 ) ?(num2 < num3) ? (num2 < num1) ?(num3 < num1) ?(num3 < num2) : (" Frist number is greater : " + num1) : ("Second number is greater : " + num2) : (" Third number is greater : " + num3);
    // System.out.println(checkGreaterNumber);

    String checkGreaterNumber = (num1 > num2) && (num1 > num3) ?("First number is greater : " + num1) : (num2 > num1) && (num2 > num3) ? ("Second number is greater :" + num2) :("Third number is greater :" + num3);
    System.out.println(checkGreaterNumber);
    //     greatestNum = a;
    // }else if((b>a) && (b>c)){
    //      greatestNum = b;
    // }else{
    //      greatestNum = c;
    // }
    // String logicalGreatestNumCheck = (numOne>numTwo) && (numOne>numThree) ? ("NumOne is larger: " + numOne) : (numTwo>numOne) && (numTwo>numThree) ? ("NumTwo is larger: " + numTwo) : ("NumThree is larger: " + numThree);
    // System.out.println(logicalGreatestNumCheck);
    

    }
   
}