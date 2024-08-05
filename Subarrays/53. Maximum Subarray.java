class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int maxi=nums[0];
        if(nums.length==0)return 0;
        for(int i=1;i<nums.length;i++){
          if(maxi<0)maxi=nums[i];
          else  maxi+=nums[i];
          sum=Math.max(sum,maxi);
        }
        return sum;
    }
}


//dp
//pattern: prev subarray cant be negative, dynamic programming: compute max sum for each prefix

class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        dp[0]=nums[0];
        int max=nums[0];
        for(int i=1;i<n;i++){
         dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
         max=Math.max(dp[i],max);
        }
        return max;
    }
}
