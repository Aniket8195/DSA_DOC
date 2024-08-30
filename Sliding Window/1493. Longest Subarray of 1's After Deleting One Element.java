class Solution {
    public int longestSubarray(int[] nums) {
        int zeros=0,max=0;
        int left=0,right=0;
        while(right<nums.length){
           if(nums[right]==0){
              zeros++;
           }
           while(zeros>1){
               if(nums[left]==0){
                   zeros--;
               }
               left++;
           }
           max=Math.max(max,right-left);
           right++;
        }
        return max;
    }
}
