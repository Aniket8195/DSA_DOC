class Solution
{
  public int padovanSequence(int n)
    {
        //return (int)solve(n)%1000000007;
        final int MOD = 1000000007;
        
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }
        
        int dp[]=new int[n+1];
        
        dp[0]=dp[1]=dp[2]=1;
        
        for(int i=3;i<=n;i++){
            dp[i]=(dp[i-2]+dp[i-3])%MOD;
        }
        return (int)dp[n];
    }
    // public static long solve(int n){
    //     if(n==0 || n==1 ||n==2){
    //         return 1;
    //     }
    //     return solve(n-2)+solve(n-3);
    // }
    
}
