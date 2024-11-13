
public class assingment1 {
    public static int findInMountainArray(int target,int [] mountainArr) {
        int peak=peakIndex(mountainArr);
        int firstHalf=targetIndex(target,mountainArr,0,peak);
        if (firstHalf!=-1){
            return firstHalf;
        }
        else{
            return targetIndex(target,mountainArr,peak+1,mountainArr.length-1);
        }
    }
    public static int targetIndex(int target,int [] arry, int start, int end ){
        int index=-1;
        boolean accending= arry[start]<arry[end]; 
        while (start<=end){
            int mid =(start+end)/2;
            if (arry[mid]==target){
                return mid;
            }
            if (accending){
                if(arry[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arry[mid]>target){
                    start=mid +1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return index;
    }
    public static int peakIndex(int [] arry){
        int start=0;
        int end =arry.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            // if (arry[mid]>arry[mid+1] && arry[mid]>arry[mid-1]){
            //     return mid;
            // }
            if(arry[mid]<arry[mid+1]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return start;
    }
    public static void main(String[] arg){
        // basic.sayname();
        // basic.myAge();
        // String myColledge ;
        // myColledge="haldia instiute of technology";
        // System.out.println(myColledge);
        // float pie;
        // pie=22/7;
        // System.out.println(pie);
        int [] arr={4,5,6,7,0,1,2};
        System.out.println(search(arr,0));

        



    }
    public static int search(int[] nums, int target) {
        int peak=pivotFinder(nums);
        int firstTry=binarySearch(nums,target,0,peak);
        int secondTry=binarySearch(nums,target,peak+1,nums.length-1);
        if(firstTry==secondTry){
            return -1;
        }
        else{
            return Math.max(firstTry,secondTry);
        }
        
    }
    public static int binarySearch(int []nums,int target,int start, int end){
        while(start<=end){
            int mid=(start+end)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if (nums[mid]<target){
                start=mid+1;
            }
            else {
                end =mid-1;
            }
        }
        return -1;
    }
    public static int pivotFinder(int []nums){
        int start=0;
        int end= nums.length-1;
        if (nums[start]<=nums[end]){
            return end;
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
   
}
