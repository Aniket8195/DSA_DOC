class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 if(i==0 || i==n-1 || j==m-1 || j==0){
                       if(grid[i][j]==1){
                          q.add(new int[]{i,j});
                          vis[i][j]=true;
                       }
                 }
            }
        }
        int []delRow={1,0,-1,0};
        int []delCol={0,1,0,-1};
        while(!q.isEmpty()){
             int r=q.peek()[0];
             int c=q.peek()[1];
             q.poll();
             for(int i=0;i<4;i++){
               int nr=r+delRow[i];
               int nc=c+delCol[i];
               if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1 && vis[nr][nc]==false){
                    q.add(new int[]{nr,nc});
                    vis[nr][nc]=true;
               }
             }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]!=true){
                 cnt++;
                }
            }
        }
        return cnt;

    }
    
}
