class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length,m=grid[0].length;

        boolean vis[][]=new boolean[n][m];
        int res=0;

        for(int i=0;i<n;i++){
               for(int j=0;j<m;j++){
                  if(!vis[i][j] && grid[i][j]==1){
                    vis[i][j]=true;
                    int cur=dfs(grid,vis,i,j,n,m);
                    res=Math.max(cur,res);
                  }

               }
        }
        return res;
    }
    private int dfs(int[][] grid,boolean vis[][],int i,int j,int n,int m){
           int dx[]={1,-1,0,0};
           int dy[]={0,0,1,-1};

          int area = 1; 

        for (int k = 0; k < 4; k++) {
            int row = i + dx[k];
            int col = j + dy[k];

           
            if (row >= 0 && row < n && col >= 0 && col < m && !vis[row][col] && grid[row][col] == 1) {
                vis[row][col] = true; 
                area += dfs(grid, vis, row, col, n, m); 
            }
        }
        
        return area; 
    }
}
