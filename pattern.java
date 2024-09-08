import java.util.Scanner;

public class pattern{
    public static void main(String[] arg ){
        // System.out.println("*\n**\n***\n****");
        // int a =10;
        // long b= 5;
        // long c= a-b/a*b;
        // long d=(a*b)/(a-b);
        // System.out .println(c );
        // System.out.println(d);
        // Scanner name= new Scanner(System.in);// to take the input from the user
        // String name1 =name.nextLine();// to store the value taken from the user
        // System.out.println(name1);
        // System.out.println(name);
        

        //assingment - to add two numbers and take the input from the user
        Scanner inputScanner= new Scanner(System.in);
        int a=inputScanner.nextInt();
        int b=inputScanner.nextInt();
        boolean c= a == b;
        System.out.println(c);

    }

} 