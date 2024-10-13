import java.util.*;

public class functionAndMethods {
    // public staitc return type function name(arguments ){
    // context of the function}
    // finctions are stored in the memory in the form of stack .
    public static void printMyName(String name ){
        System.out.println(name+" is my name .");
        return;
    }
    public static int productOfTwo(int number,int number2){
        int product=number*number2;
        return product;
    }
    public static int factorialOfNumber(int number){
        int product =1;
        for(int i=0;i<=number;i++){
            if(i==0){
                product= 1;
            }
            else {
                product = i * product ;
            }
            
        }
        return product ;
    }
    // this can be used to take as much as arguments as possible but if you are using this with the defined 
    // arguments then it should be pressent at the of the passing arguments
    public static void variableArguments(int a, String ...v){
        System.out.println(Arrays.toString(v) );
    }
    static void armgstrongNumber(){
        int num=100;
        while (num<1000) {
            int a=num%10;
            int b=(num/10)%10;
            int c=num/100;
            if (dsa.myPow(a,3)+dsa.myPow(b, 3)+dsa.myPow(c, 3)==num){
                System.out.println(num);
            }
            num++;
            
        }

        
    }
    public static void main(String[] arg){
        // Scanner sr= new Scanner (System.in);
        // String n1=sr.next();
        // printMyName(n1);
        // int a=sr.nextInt();
        // int b=sr.nextInt();
        // int c=productOfTwo(a,b);
        // System.out.println(c);
        // int factorial =factorialOfNumber(a);
        // System.out.println(factorial);
        armgstrongNumber();
        // variableArguments(4,"aman kumat karn ", "says ","hi");

    }
    
}
// funvtion overloding reffres to the situation where we have two or more function with the same name but 
// the arguments or the number of arguments should be differen.