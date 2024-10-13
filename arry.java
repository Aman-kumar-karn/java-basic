import java.util.*;

public class arry {
    public static void main(){
        Scanner sr= new Scanner(System.in);
        // System.out.println("enter the size of array");
        // int n=sr.nextInt();
        // int marks[]=new int[n];
        // System.out.println("enter the number of inside the array:");
        // for(int i =0;i<n;i++){
        //     marks[i]=sr.nextInt();
        // }
        // System.out.println("enter the number to be searched: ");
        // int search= sr.nextInt();
        // for(int i =0;i<marks.length;i++){
        //     if(marks[i]==search){
        //     System.out.println("marks stored at index "+i+"is "+marks[i]);
        //     }
        // }
        

        // //2d array 

        // type [][]name=new type[rows][collumn]
        // int []number={1,2,3,4,5};
        // System.out.println(number.length);

        // System.out.println("Enter the number of rows and column");
        // int row =sr.nextInt();
        // int colm =sr.nextInt();
        // int matrix[][]=new int[row][colm];
        // for(int i =0;i<row;i++){
        //     for(int j=0;j<colm;j++){
        //         matrix[i][j]=sr.nextInt();

        //     }
        //     // System.out.println();
        // }
        // for(int []a:matrix){
        //     System.out.println(Arrays.toString(a));
        //     System.out.println( );
        // }
        // System.out.println("enter the number to be searched");
        // int search = sr.nextInt(),j=-1;

        // for(int []a:matrix){
        //     j++;
        //     int k=-1;
        //     for(int  b: a){
        //         k++;
        //         if(search==b){
        //         System.out.println("The matrix hsa been found at "+j+"row and"+k+"column");
        //         }
        //     }
            
        // }


        // array list


        // ArrayList <Integer> marks=new ArrayList<>(5);
        // marks.add(34);
        // marks.add(43);
        // marks.add(67);
        // marks.add(64);
        // marks.add(64);
        // marks.add(62);
        // System.out.println(marks);
        // System.out.println(marks.get(4));//we cannot access the index using marks[i]
        String name="sudhansu" ,tittle ="sharma";
        char find='a';
        System.out.println(Arrays.toString((name+tittle).toCharArray()));
        System.out.println(binarySearch(name, find));
    }
    public static boolean binarySearch(String object ,char target){
        if(object.length()==0){
            return false;
        }
        int i =0;
        for(char n:object.toCharArray()){
            i++;
            if(n==target){
                System.out.println(i-1);
                return true;
            }
        }
        return false;
    }
    
}
