import java.util.*;
public class dsa {
    // public int[] twoSum(int[] nums, int target) {
    //     for (int i=0;i<nums.length;i++){
    //         for(int j=(nums.length-1);j>i;j--){
    //             if(nums[j]+nums[i]==target){
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int []{};
    // }


    // public static int longestSubarray(int[] nums) {
    //     int maxVal = 0, ans = 0, currentStreak = 0 ;

    //     for (int num : nums) {
    //         if (maxVal < num) {
    //             maxVal = num;
    //             ans = currentStreak = 0;
    //         }

    //         if (maxVal == num) {
    //             currentStreak++;
    //         } else {
    //             currentStreak = 0;
    //         }

    //         ans = Math.max(ans, currentStreak);
    //     }
    //     return ans;
    // // }
    // public static int longestSubarray(int[] nums) {
    //     int n =nums.length, counter=0, max=0,ans=0;
    //     for (int i=0;i<n;i++){
    //         if(max<nums[i]){
    //             max=nums[i];
    //             ans=counter=0;
    //         }
    //         if (max==nums[i] ){
    //             counter++;
    //         }
    //         else{
    //             counter =0;
    //         }
    //     }
    //     return Math.max(counter,ans);
    // }

    public static double product=1;
    public static double MyPow(double x, int n){
        if (n == 0) return 1.0;
        if (x == 1.0) return 1.0;
        if (x == -1.0 && n % 2 == 0) return 1.0;
        if (x == -1.0 && n % 2 != 0) return -1.0;
        if (x == 0.0) return 0.0;

        long exp = n;
        if (n < 0) {
            x = 1 / x;
            exp = -exp; 
        }

        double result = 1.0;
        while (exp > 0) {
            if ((exp % 2) == 1) {
                result *= x;
            }
            x *= x;
            exp /= 2;
        }

        return result;
    }
    public static int removeElement(int[] nums, int val) {
        int k =0;
        int j=nums.length;
        for(int l=0;(l<j);l++){
            while(nums[k]==val){
                for(int i =k;i<j-1;i++){
                    nums[i]=nums[i+1]; 
                }
                --j;
            }
            k++;

        }
        return j;
        
    }

    public static double myPow(double x, long n) {
        if (n==1){
            return x;
        }
        else if(n==0){
            return 1;
        }
        // long n1=n;
        if (n<-1){
            x=1/x;
            n=-1*n;
        }
    
        
        if(n%2==0){
            product=myPow(x,n/2);
            return product*product;
        }
        else{
            product=myPow(x,n/2);
            return product*product*x;
        }
         
    }
    public static int findNumbers(int[] nums) {
        int k=0;
        for(int a : nums){
            String d=a+"";
            int c = d.length();
            if(c%2==0){
                k++;
            }
        }
        return k;
        
    }
    public static int digits(int nums){
        int count=0;
        if(nums < 0){
            nums *= -1;
        }
        while(nums>0){
            count++;
            nums /= 10;
        }
        return count;
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length, n=nums2.length;
        int []NewArray= new int [m+n];
        int temp=0;
        int i=0,j=0;
        while(temp<m+n-1){
            if(nums1[i]<nums2[j]){
                NewArray[temp]=nums1[i];
                if (i<m-1){

                    i++;
                }
                temp++;
            }
            else if (nums2[j]<nums1[i]){
                NewArray[temp]=nums2[j];
                if (j<n-1){

                    j++;
                }
                temp++;
            }
            else{
                i++;
                j++;
                temp++;
            }
        }
        NewArray[temp]=Math.max(nums1[i],nums2[j]);
        double d=median(NewArray);
        return d;
        
    }
    public static double median(int [] nums){
        int n=nums.length;
        if (n%2==0){
            int a=nums[(n/2)-1];
            int b=nums[n/2];

            double d= Math.abs((a+b)/2);
            Math.abs(d);
            return Math.abs((a+b)/2);
        }
        else {
            return (double)nums[(n/2)];
        }
    } public static char nextGreatestLetter(char[] letters, char target) {
        int end=letters.length-1;
        int start=0;
        while (start <=end){
            int mid =(start+end)/2;
            if(letters[mid]==target){
                start=mid+1;
            }
            if(letters[mid]>target){
                end=mid-1;
            }
            else if(letters[mid]<target){
                start=mid+1;
            }
        }
        return letters[start];
        
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=(i+1)&& nums[correct]!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=nums[i];
            }
            else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if (nums[i]!=i+1){
                answer.add(i+1);
            }
        }

        return answer;
    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else if (nums[i]==nums[correct]&& i!=correct){
                return nums[i];
            }
            else {
                i++;
            }
        }
        return -1;
    }
    public static int findDuplicate2(int[] nums) {
        boolean[] arr = new boolean[nums.length];

        for(int i : nums){
            if(arr[i] == true){
                return i;
            }
            else{
                arr[i] = true;
            }
        }
        return -1;
    }
    public static int [] findErrorNums(int[] nums) {
        boolean [] check=new boolean[nums.length];
        for(int x : nums){
            if(check[x]==true){
                return new int [] {x,x+1};
            }
            else{
                check[x]=true;
            }
        }
        return new int [] {-1,-1};
        
    }
    // public int IndexOf(int target,int [] arry){
    //     for(int i=0;i<arry.length;i++){
    //         if(target==arry[i]){
    //             return i+1;
    //         }
    //     }
    // }
    public static int firstMissingPositive(int[] nums) {
        int max=Arrays.stream(nums).max().getAsInt();
        boolean [] check= new boolean[max];
        for(int x: nums){
            if(x>0){
                check[x-1]=true;
            }
        }
        for(int i=0;i<check.length;i++){
            if(check[i]==false){
                return i+1;
            }
        }
        return -1;    
    }

//     int count= nums.length-k+1;
//     int [] answer=new int[count];
//     for(int i=0;i<count;i++){
//         int j=0;
//         while(j<k){
//             if (duplicate(nums,i,i+k)==true){
//                 break;
//             }
//             else{
//                 answer[i]=sum(nums,i,i+k);
                
//             }
//         }
//     }
//     return Arrays.stream(answer).max().getAsInt();    
// }
// public int sum(int [] arry, int start, int end){
//     int add=0;
//     for(int i=start;i<end;i++){
//         add += arry[i];
//     }
//     return add;
// }
// public boolean duplicate(int [] arry, int start, int end){
//     int max = Arrays.stream(arry).max().getAsInt();
//     boolean [] check = new boolean[max];
//     for(int i=0;i<(end-start);i++){
//         if(check[arry[i]]==true){
//             return true;
//         }
//         else {
//             check[arry[i]]=true;
//         }

//     }
//     return false;
// }
    public static void  main(String[] args){
        // int [ ] num={3,3,546,656,54,45,5645,2};
        // System.out.println(removeElement(num,2));
        // long k=-1;
        // k >>>=1;
        // System.out.println(myPow(2,-2147483648));
        // System.out.println(k);
        // System.out.println(longestSubarray(num));
        char [] a ={'x','x','y','y'};
        // System.out.println(findNumbers(a)); 
        // System.out.println((int)Math.log10(34333));
        int [] nums1 = {1,2,0} ,nums2 = {2,3};
        char target='z';
        // System.out.println(nextGreatestLetter(a,target));
        System.out.println(firstMissingPositive(nums1));



    }
    
}
