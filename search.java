import java.util.*;

public class search {
    public static int BinarySearch2(int [] num,int start,int end,int x){
        while (start<=end){
            int mid = (start+end)/2;
            if(num[mid]==x){
                return mid;
            }
            else if(num[mid]<x){
                return BinarySearch2(num, mid+1,end,x);
            }
            else if(num[mid]>x){
                return BinarySearch2(num, start, mid-1, x);
            }
            
        }
        return end;
    }
    public int[] searchRange(int[] nums, int target) {
        int [] position= {-1,-1};
        position(0)=place(nums,target,true);
        position(1)=place(nums,target,false);

        return position;
    }
    public int place(int[] nums, int target, boolean startIndex){
        int [] position= {-1,-1};
        int end=nums.length-1,start=0,mid=0;
        while(end>=start){
            mid=(start+end )/2;
            if(nums[mid]==target){
                if (startIndex){
                    position[0]=mid;
                    end=mid-1;
                    }
                else{
                    position[1]=mid;
                    start=mid+1;
                }
            }
            else if (nums[mid]>target){
                end=mid-1;
            }
            else if (nums[mid]<target){
                start=mid+1;
            }
        }
        if(startIndex){
            return position(0);
        }
        else {
            return position(1);
        }
    }

    public static int binarySearch(int [] num, int target){
        int len=num.length;
        int temp =0,arry=0;
        while(len>=temp){
            int mid =(len+temp)/2;
            if(num[mid]==target){
                arry=num[mid];
            }
            else if (num[(temp+len)/2]>target){
                len=mid-1;
            }
            else if (num[(temp+len)/2]<target){
                temp=mid+1;
            }

        }
        return num[len];

    }
    public static void main(String[] args){
        System.out.println("enter length of the array");
        Scanner sr =new Scanner(System.in);
        // int len=sr.nextInt();
        int []arry={-2,-1,0,1,3};
        int answer=0;

        // for(int i =0;i<len;i++){
        //     arry[i]= sr.nextInt();
        // }
        // System.out.println("ente the nmber to be printed");  
        int target=-1;
        System.out.println(BinarySearch2(arry, 0, arry.length, target));
        
    }
    // while (start<end){
    //     int mid =(start+end)/2; 
    //     if(arr[mid]>arr[mid+1]){
    //         end=mid;
    //     }
    //     else{
    //         start=mid+1;
    //     }
    // }
    // return mid;
    
}

