class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int l=0,r=0,odds=0,cnt=0,m=0;
        while(r<nums.length){
          if(nums[r]%2==1){
            odds++;
          }
          while(odds>k){
             if(nums[l]%2==1){
                   odds--;
             }
             l++;
             m=l;
          }
          if(odds==k){
            while(nums[m]%2!=1){
             m++;
            }
            cnt=cnt+(m-l+1);
          }
          r++;
        }
        return cnt;
    }
}
