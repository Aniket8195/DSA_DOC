// brute force use two for loops
// generate all subaarys and product take max
for(i to n){
  prod=1;
  for (j=0 to n){
    prod=prod*arr[j];
    max=Math.max(prod,max);
  }
}
return max;





//Strivers Solution
class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length; 

        double pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;
            pre *= (double)arr[i];
            suff *= (double)arr[n - i - 1];
            ans = (int)Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }
}
