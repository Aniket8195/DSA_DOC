https://leetcode.com/problems/unique-paths/solutions/5339987/easiest-solution-dp
You can see my solution of Unique paths 1 problem. Both problems are similar but here we have obstacle. 
  Only difference in code is that we mark paths to obstacle as 0. All the other code and approch is same.


  class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        if(grid[0][0]==1) grid[0][0]=0;
        else grid[0][0]=1;
        int n=grid.length;
        int m=grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0) continue;
                else if(grid[i][j]==1) grid[i][j]=0;
                else if(i-1>=0 && j-1>=0) grid[i][j]=grid[i][j-1]+grid[i-1][j];
                else if(i-1>=0 && j-1<0) grid[i][j]=grid[i-1][j];
                else grid[i][j]=grid[i][j-1];
            }
        }
        return grid[n-1][m-1];
    }
}
