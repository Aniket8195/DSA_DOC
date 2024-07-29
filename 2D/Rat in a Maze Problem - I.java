class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        ArrayList<String>res=new ArrayList<>();
        if (mat[0][0] == 0 || mat[mat.length - 1][mat[0].length - 1] == 0) {
            return res; 
        }
        boolean[][] vis = new boolean[mat.length][mat[0].length];
        bfs(res,"",mat,0,0,vis);
        return res;
    }
    private void bfs(ArrayList<String>res,String cur,int [][]mat, int r,int c,boolean[][] vis){
        int rows=mat.length;
        int cols=mat[0].length;
        if(r==rows-1 && c==cols-1){
             res.add(cur);
             return;
        }
        vis[r][c]=true;
        int dx[]={1,0,-1,0};
        int dy[]={0,1,0,-1};
        char[] dir = {'D', 'R', 'U', 'L'};
        for(int i=0;i<4;i++){
            int nrow=r+dx[i];
            int ncol=c+dy[i];
            if(nrow>=0 && nrow<rows && ncol>=0 && ncol<cols && mat[nrow][ncol]==1&&!vis[nrow][ncol]){
               bfs(res,cur+dir[i],mat,nrow,ncol,vis);
            }
        }
        vis[r][c] = false;
    }
}
