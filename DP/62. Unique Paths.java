Image cells represent number of unique paths to each cell.For cell (0,0) 
we will ininitialize paths as 1. for next all values number of unique paths will be 
the sum of unique paths to cell above it and number of unique paths to cell below it.


  class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[n][m];
        dp[0][0]=1;


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(i==0 && j==0) continue;
               if(i-1>=0 && j-1>=0){
               dp[i][j]=dp[i-1][j]+dp[i][j-1];
               }else if(i-1<0 && j-1>=0){
                dp[i][j]=dp[i][j-1];
               }else{
                   dp[i][j]=dp[i-1][j];
               }

            }
        }
        return dp[n-1][m-1];
    }
}
