import java.util.*;

public class loops {
    public static void main(){
        // for(int i=0;i<=10;i++){
        //     System.out.print( i );
        // }
        //  int  q=0 ;
        // while(q <10){
        //     System.out.println(q);
        //     q++;
        // }
        // System.out.println("new");
        // do{
        //     System.out.println(q);
        //     q++;

        // }while(q<20);
        int sum =0;
        System.out.println("enter the number");
        Scanner sr =new Scanner(System.in);
        int n= sr.nextInt();

        for(int i=1;i<=n;i++){
            int p=i*i;
            sum=sum+p;
            System.out.println(sum);
        }
        System.out.println(sum);
   
    }
    
}
