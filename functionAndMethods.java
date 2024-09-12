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
    public static void main(String[] arg){
        Scanner sr= new Scanner (System.in);
        String n1=sr.next();
        printMyName(n1);
        int a=sr.nextInt();
        int b=sr.nextInt();
        int c=productOfTwo(a,b);
        System.out.println(c);
        int factorial =factorialOfNumber(a);
        System.out.println(factorial);

    }
    
}
