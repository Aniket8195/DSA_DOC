class Solution {
    public int[] rearrangeArray(int[] nums) {
        int nm=nums.length;
        int []ans=new int[nm];
        int p=0;
        int n=1;
        
        for(int i=0;i<nm;i++){
            if(nums[i]<0){
             ans[n]=nums[i];
             n=n+2;
            }else{
            ans[p]=nums[i];
            p=p+2;
            }
        }
        return ans;
    }
}
