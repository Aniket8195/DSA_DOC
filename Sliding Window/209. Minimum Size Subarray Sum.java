class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int sum=0;
        int len=Integer.MAX_VALUE;
               while(r<nums.length){
                    sum+=nums[r];
                    while(l<=r && sum>=target){
                        len=Math.min(len,r-l+1);
                        sum=sum-nums[l++];
                    }
                    r++;
               }
               return len==Integer.MAX_VALUE? 0 :len;
    }
}
