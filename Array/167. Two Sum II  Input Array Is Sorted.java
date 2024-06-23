class Solution {
    public int[] twoSum(int[] num, int target) {
       int []ans={-1,-1};
          int low=0;
          int high=num.length-1;

          while(low<high){
             int sum = num[low] + num[high];
            if (sum == target) {
                ans[0] = low + 1;
                ans[1] = high + 1;
                break;
            } else if (sum > target) {
                high--;
            } else {
                low++;
            }

          }
          return ans;
    }
}
