class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
          sum+=nums[i];
        }
        int n=nums.length;
        int l=0;
        int r=k;
        int max=sum;
        while(r<n){
          sum-=nums[l];
          l++;
          sum+=nums[r];
          r++;
          max=Math.max(sum,max);
        }
        return (double)max/k;
    }
}
