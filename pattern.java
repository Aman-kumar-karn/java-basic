import java.util.*;

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
        // Scanner inputScanner= new Scanner(System.in);
        // int a=inputScanner.nextInt();
        // int b=inputScanner.nextInt();
        // boolean c= a == b;
        // System.out.println(c);



        //advance patterns 
        // Scanner sr = new Scanner(System.in);
        // int r = sr.nextInt();
        // int c = sr.nextInt();
        // // for(int i =1;i<=l;i++){
        // //     for(int q =1;q<=b;q++){
        // //         System.out.print("*");
        // //     }
        // //     System.out.println();
        // // }
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=c;j++){
        //         if(i==1 || j==1 || i==r || j==c){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //pattern no.2
        // Scanner sr= new Scanner(System.in);
        // int r = sr.nextInt();
        // // int c = sr.nextInt();
        // for(int i =1;i<=r;i++){
        //     for (int j = 1; j<= i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // // pattern no 3
        // Scanner sr= new Scanner(System.in);
        // int r=sr.nextInt();
        // for(int i=1; i<= r; i++){
        //     for (int j=r;j>=i;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        // //pattern no 4
        // Scanner sr=new Scanner(System.in);
        // int r=sr.nextInt();
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=r;j++){
        //         if(j>r-i){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
                
        //     }
        //     System.out.println();
        // }


        // // number pattern no 1
        // Scanner sr =new Scanner(System.in);
        // int r=sr.nextInt();
        // for(int i=1; i<=r;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // // number pattern no 2
        // Scanner sr= new Scanner(System.in);
        // int c=sr.nextInt();
        // for (int i=c;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        //number pattern 3
        // Scanner sr=new Scanner(System.in);
        // int c=sr.nextInt();
        // int sum=0;
        // for(int i =1;i<=c;i++){
        //     for(int j=1;j<=i;j++){
                
        //         sum++;
        //         System.out.print(sum+" ");
        //     }
        //     System.out.println();

        // }


        //number pattern 2
        Scanner sr=new Scanner(System.in);
        int c=sr.nextInt();
        for(int i =1;i<=c;i++){
            for(int j=1;j<=i;j++){
                if((j+i)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }

} 