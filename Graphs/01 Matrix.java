// Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
// The distance between two adjacent cells is 1.


class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length,n=mat[0].length;
       int dist[][]=new int[m][n];
       Queue<int[]>q=new LinkedList<>();
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(mat[i][j]==0){
                   dist[i][j]=1;
                   q.offer(new int[]{i,j});
               }
           }
       }
       if(q.isEmpty()||q.size()==n*m)return mat;
       int dirs[][]={{1,0},{-1,0},{0,1},{0,-1}};
       while(!q.isEmpty()){
           int cell[]=q.poll();
           int x=cell[0],y=cell[1];
           for(int []dir:dirs){
               int nx=x+dir[0],ny=y+dir[1];
               if(nx>=0 && nx<m && ny>=0 && ny<n && dist[nx][ny]==0){
                   mat[nx][ny]=mat[x][y]+1;
                   dist[nx][ny]=1;
                   q.offer(new int[]{nx,ny});
               }
           }
       }
       return mat;
    }
}
