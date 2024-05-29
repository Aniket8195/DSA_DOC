class Solution {
    public boolean canJump(int[] nums) {
        int g=nums.length-1;
        int i=nums.length-2;
        while(i>=0){
         if(i+nums[i]>=g){
             g=i;
         }
         i--;
        }
        return g==0;
    }
}
