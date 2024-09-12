import java.util.Scanner;
public class pattern_advance {
    public static void main(){
        Scanner sr= new Scanner(System.in);
        int n= sr.nextInt();
        for (int i=1;i<=n;i++){
            for(int j = 1;j<=2*n;j++){
                if(j<=i||i+j>=2*n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=n;i<=2*n;i++){
            for(int j = 2*n;j>= 1;j--){
                if(j>i||j+i<2*n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //second option
        // for (int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j= 1;j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for (int j= 1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // //for outter loop
        // for (int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j= 1;j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for (int j= 1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }   
    }
    
}
