import java.util.Scanner;

public class Switch {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1:
            System.out.println("button 1 is pressed");
            break;
            case 2:
            System.out.println("button 2 is pressed");
            break;
            case 3:
            System.out.println("button 3 is pressed");
            break;
            default:
            System.out.println("invalid button");



        }
    }
    
}
