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
            int c= digits(a);
            if (c%2==0){
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
    
    public static void  main(String[] args){
        // int [ ] num={3,3,546,656,54,45,5645,2};
        // System.out.println(removeElement(num,2));
        // long k=-1;
        // k >>>=1;
        // System.out.println(myPow(2,-2147483648));
        // System.out.println(k);
        // System.out.println(longestSubarray(num));
        int [] a ={12,345,2,6,7896};
        System.out.println(findNumbers(a)); 


    }
    
}
