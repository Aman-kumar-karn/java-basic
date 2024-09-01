public class basic{
    public static void main(String[] arg) {
        Main.hi();
        System.out.println(arg[0]);
        System.out.println(arg[1]);
        System.out.println(arg[2]);

    }
    public static void sayname(){
        System.out.println("aman");

    }
    public static void myAge(){
        System.out.println(45);
    }
}
/*their are three types of access modifiers first one is public methord - it 
 * ca be accessed inside or outside the class and package . private methord - it can only be 
 * used inside the class the class. static mehors- we can use the fiels or methors using class name
  */
  /* here java finds this objecct .hi in the Main methord created by us 
         * here java-basic is the package in which we can create new classes 
         * and inside classes we can create new methords
         */