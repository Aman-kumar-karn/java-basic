import java.util.Scanner;

public class ifElse {
    public static void main(String[] arg){
        // System.out.println("enter your age:");
        // Scanner sc= new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age>=18){
        //     System.out.println("you are an adult");
        // }
        // else{
        //     System.out.println("you are not an adult");

        // }
        
        //odd and even
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // if (number%2 ==0 ){
        //     System.out.println("it is an even number");

        // }
        // else{
        //     System.out.println("it is an odd number");
        // }
        int a =sc.nextInt();
        int b =sc.nextInt();
        if(a >b){
            System.out.println( "a is greater than b");
        }
        else if (a==b) {
            System.out.println("a is equal to b");
        }
        else{
            System.out.println("b is greater than a ");
        }




    }
    
}
