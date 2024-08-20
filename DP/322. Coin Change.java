class Solution {

    public int minCoins(int coins[], int m, int sum) {
        // Your code goes here
        int dp[] = new int[sum + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= sum; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    int res = dp[i - coins[j]];
                    if (res != Integer.MAX_VALUE && res + 1 < dp[i]) {
                        dp[i] = res + 1;
                    }
                }
            }
        }
        
        return dp[sum] == Integer.MAX_VALUE ? -1 : dp[sum];
    }
}









class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1;i<amount+1;i++){
              for(int c:coins){
                if(i-c>=0){
                   dp[i]=Math.min(dp[i],1+dp[i-c]);
                }
              }
        }
        return (dp[amount]==amount+1)?-1 : dp[amount];
    }
}
