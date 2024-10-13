import java.util.*;

public class Strings {
    public static void main(){
        Scanner sr = new Scanner (System.in);
        // String name= sr.next();
        // String lastName = sr.next();
        // // as seen in this case even if you put a same valeue the strig is not said to be the same 
        // if (lastName == name){
        //     System.out.println("Both has a same string values "+name +" and "+ lastName);
        // } 
        // else{
        //     System.out.println("Both has siffernt string values "+name +" and "+ lastName);

        // }
        // // we can also use comapar to option . It is more efficient than using == operator to compare the string

        // if (lastName.compareTo(name)==0){
        //     System.out.println("Both has a same string values "+name +" and "+ lastName);
        // } 
        // else{
        //     System.out.println("Both has siffernt string values "+name +" and "+ lastName);

        // }
        // Scanner scr=new Scanner(System.in);
        // String sentence = scr.nextLine();
        // System.out.println(sentence.length()+"****" +sentence.charAt(4));// prints the length of the string 
        // System.out.println(sentence.substring(2,sentence.length()));



        // // String builder
        // StringBuilder n1= new StringBuilder("tony");
        // System.out.println(n1.charAt(2));
        // n1.setCharAt(2,'s');
        // System.out.println(n1);
        // n1.insert(2,'n');
        // System.out.println(n1);
        // n1.delete(2,3);//ending index is non inclusve
        // System.out.println(n1);
        // n1.append(' ');
        // n1.append('i');
        // n1.append('s');
        // n1.append(' ');
        // n1.append('o');
        // n1.append('k');
        // System.out.println(n1.length());

        // reverse the string
        
        // StringBuilder revers=new StringBuilder("");
        StringBuilder data= new StringBuilder(sr.nextLine());
        for(int i=0;i<data.length()/2;i++){
            // char n2=data.charAt(i);
            // int j=1;
            char front=data.charAt(i);
            data.setCharAt(i,data.charAt(data.length()-1-i));
            data.setCharAt((data.length()-1-i),front);

            // revers.append(data.charAt(i));
            System.out.println(data);

        }
        System.out.println(5/2);
        
        




    }
}
