class Solution {
    public int rob(int[] nums) {
        int rob1=0,rob2=0;

        //[rob1,rob2,n,n+1,.....] if we rob n we need to rob rob1 and for n+1 - rob2
        for(int i=0;i<nums.length;i++){
           int temp=Math.max(nums[i]+rob1,rob2);
           rob1=rob2;
           rob2=temp;
        }
        return rob2;
    }
}
