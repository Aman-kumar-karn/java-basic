import java.util.*;

public class sorting {
    public static int[]  bubbleSort(int [] arr){
        // in bubble sort we compare with the adjecent element and put the highest value at the end
        boolean swapp=true;
        for(int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapp=false;
                }
            }
            if(swapp){
                break;
            }
        }
        return arr; 
    }
    public static int [] insertionSort(int [] arr){
        for(int i=1;i<arr.length-1;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }
    public static int[] selectionSorting(int []arr){
        for (int i=0;i<arr.length;i++){
            int max=highest(arr,0,arr.length-i);
            swap(arr, max, arr.length-1-i);

        }
        return arr;
    }
    public static void swap(int [] arr,int first , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    } 
    public static int highest(int[] arr,int start, int end){
        int highest=start;
        for(int i=1;i<end;i++){
            if(arr[i]>arr[highest]){
                highest=i;
            }
        }
        return highest;
    }
    public static void main(String args []){
        int [] arry={ 4,6,8,2,1,9};
        // System.out.println(Arrays.toString(bubbleSort(arry)));
        // System.out.println(Arrays.toString(selectionSorting(arry)));
        System.out.println(Arrays.toString(insertionSort(arry)));

    }
    
}
