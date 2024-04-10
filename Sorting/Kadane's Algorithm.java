class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=Integer.MIN_VALUE;
        int maxi=0;
        for(int i=0;i<n;i++){
             maxi=maxi+nums[i];
             if(maxi>sum){
              sum=maxi;
             }
             if(maxi<0){
                    maxi=0;
             }
        }
        return sum;
    }
}
