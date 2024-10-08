class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int l=0;
        int r=n-1;
        for(int i=n-1;i>=0;i--){
               if(Math.abs(nums[l])<Math.abs(nums[r])){
                  res[i]=nums[r]*nums[r];
                  r--;
               }else{
                res[i]=nums[l]*nums[l];
                l++;
               }
        }
        return res;
        
    }
}
