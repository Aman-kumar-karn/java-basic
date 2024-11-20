import java.util.*;
import java.util.function.IntFunction;

class arry {
    public static void main(String[] args){
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
        // String name="sudhansu" ,tittle ="sharma";
        // char find='a';
        // System.out.println(Arrays.toString((name+tittle).toCharArray()));
        // System.out.println(binarySearch(name, find));
        // double c=5/2;
        // System.out.println(c);
        // char []letters = {'c','f','j'};
        // char target = 'a';
        // System.out.println(nextGreatestLetter(letters,target));
        // List <Integer> arry= new ArrayList<>();
        // Integer [] arr={1,4,6,4,4};
        System.out.println(Arrays.toString(beautifulArr(5)));
        
    }
    public static int [] beautifulArray2(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);
        while(ans.size()<n){
            ArrayList<Integer> temp=new ArrayList<>();
            for (int i =0;i<ans.size();i++){
                if(ans.get(i)*2-1<=n){
                    temp.add(ans.get(i)*2-1);
                }
            }
            for (int i=0;i<ans.size();i++){
                if(((ans.get(i)*2))<=n){
                    temp.add(ans.get(i)*2);
                }
            }
            ans=temp;
        }
        int[] out=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            out[i]=ans.get(i);
        }
        
        return out;
    }
    public static int [] beautifulArr(int n ){
        int[]res=new int[n];
        if(n==1){
            return new int[]{1};
        }
        else if(n==2){
            return new int[]{1,2};
        }
        else{
            int[]odds=beautifulArr((n+1)/2);
            int[]even=beautifulArr(n/2);
            for(int i=0;i<odds.length;i++){
                res[i]=odds[i]*2-1;
            }
            for(int j=0;j<even.length;j++){
                res[odds.length+j]=even[j]*2;
            }
        }
        return res;
    }
    

    public static char nextGreatestLetter(char[] letters, char target) {
        char answer=letters[0];
        int end=letters.length,start=0,mid=0;
        if (letters[end-1]<target){
            return answer;
        }
        while(start<=end){
            mid=(start+end)/2;
            if (target<letters[mid]){
                answer=letters[mid];
                end=mid-1;
            }
            else if(target>letters[mid]){
                start=mid+1;
            }
        }
        return answer;
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
