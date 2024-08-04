class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer>res=new ArrayList<>();
        int MOD = 1000000007;
        for(int i=0;i<n;i++){
            int ans=0;
          for(int j=i;j<n;j++){
                ans=(ans+nums[j])%MOD;
                res.add(ans);
          } 
        }
        Collections.sort(res);
        long res1=0;
        for(int i=left-1;i<right;i++){
              res1=(res1+res.get(i))%MOD;
        }
        return (int)res1;
    }
}
