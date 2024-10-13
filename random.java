public class random {
    public static void facAndpower(){
        int i=1;
            int fact=1,power=1;
            do{
                System.out.println("factorial = "+ fact);
                for(i = 2;i>=0;i++){
                    fact=i*(i-1);
                    System.out.println("factorial of"+i+"=" +fact);
                    power=i*i;
                    System.out.println("power = "+power);
                    if(power==fact){
                        System.out.println("number is "+ i+" having factorial "+ fact+"and power as "+power);
                        return;
                    }
                }
            }while(power!=fact);
        System.out.println("************************************");
        System.out.println(i);
    }
    public static void main(){
        facAndpower();
    }
    
}

