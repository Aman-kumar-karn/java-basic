import java.util.Scanner;
public class pattern_advance2 {
    public static void main(){
        Scanner sr= new Scanner(System.in);
        int n= sr.nextInt();
        // for(int i =n;i>=1 ; i--){
        //     for(int j =1;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        

        // // pattern no 3
        // for (int i =1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println( );
        // }
        


        // //pylendrome pattern
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();

        // }


        //Dimond pattern 


        for(int i=1;i<=n;i++){
            for(int j= 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j= 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
        for(int i=n;i>=1;i--){
            for(int j= 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j= 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
}
    
