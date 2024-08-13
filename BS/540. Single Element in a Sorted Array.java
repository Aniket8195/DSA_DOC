class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
    int l = 0, r = (nums.length - 3)/2;

    while(l <= r){
      int m = (l+r)>>1;
      if(nums[2*m] == nums[2*m+1]) l = m + 1;
      else                         r = m - 1;
    }

    return nums[2*l];
    }
}
