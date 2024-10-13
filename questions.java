import java.util.*;

public class questions {
    //printing the average of two numbers
    public static void averageOfThreeNumberes(int a, int b, int c){
        System.out.println((a+b+c)/3);
        return;
    }
    public static void sumOfOdd(int a){
        int sum=0;
        for(int i=a;i>=1;i--){
            if(i%2!=0){
                sum =i+sum;
            }
        }
        System.out.println(sum);
    }
    public static void greatesOfTwo(int a,int b){
        if (a<b){
            System.out.println(b);
        }
        else {
            System.out.println(a);
        }
    }
    public static void numberCount(){
        Scanner sr=new Scanner (System.in);
        // System.out.println("enter the number and to end write 'stop' ");
        System.out.println("if want ot continue press'y' else press 'n' ");
        String end=sr.next();
        
        int i=0 ,j=0,k=0;
        while(end.equals("y")){
            System.out.println("enter the number ");
            int a =sr.nextInt();
            System.out.println("if want ot continue press'y' else press 'n' ");
            end=sr.next();
            
            if (a<0){
                i++;
            }
            else if (a==0){
                j++;
            }
            else{
                k++;
            }

        }
        System.out.println(i +" is the number of negative integers");
        System.out.println(j+ " is the number of zeros");
        System.out.println(k +" is the number of posistve numbers");
        return;

    }

    public static int fibonachi(int n){

        if(n==0 || n==1){
            System.out.print(n+" ");
            return;
        }
        else{
            int fib=fibonachi(n-2)+ fibonachi(n-1);
            System.out.print(fib+ " ");
            return ;
        }
    }
    
    public static void main(){
        Scanner sr=new Scanner(System.in);
        // int a=sr.nextInt();
        // int b=sr.nextInt();
        // int c=sr.nextInt();
        // averageOfThreeNumberes(a, b, c);
        // sumOfOdd(a);
        // greatesOfTwo(a, b);
        // numberCount();
        fibonachi(5);


    }
    
}
