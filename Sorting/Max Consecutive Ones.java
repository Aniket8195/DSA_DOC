class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m=0,max=-1;
        for(int i=0;i<nums.length;i++){
             if(nums[i]==0){
                max=Math.max(m,max);
                m=0;
             }else{
              m++;
             }
        }
        max=Math.max(m,max);
        return max;
    }
}
