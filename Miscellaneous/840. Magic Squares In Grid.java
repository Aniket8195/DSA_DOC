class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        if(n<3 || m<3){
          return 0;
        }
        int res=0;
        for(int i=0;i<=n-3;i++){
            for(int j=0;j<=m-3;j++){
                if(isValid(i,j,grid)){
                res++;
               }
               
            }
        }
        return res;
    }
    private boolean isValid(int r,int c,int [][]grid){
       HashSet<Integer>hs=new HashSet<>();
       for(int i=r;i<r+3;i++){
        for(int j=c;j<c+3;j++){
           if(hs.contains(grid[i][j]) || grid[i][j]>9){
               return false;
           }
           hs.add(grid[i][j]);
        }
       }
       for(int i=r;i<r+3;i++){
        if(grid[i][c]+grid[i][c+1]+grid[i][c+2]!=15){
            return false;
        }
       }
       for(int i=c;i<c+3;i++){
        if(grid[r][i]+grid[r+1][i]+grid[r+2][i]!=15){
            return false;
        }
       }
       if((grid[r][c]+grid[r+1][c+1]+grid[r+2][c+2]!=15) || (grid[r][c+2]+grid[r+1][c+1]+grid[r+2][c]!=15)){
        return false;
       }
       return true;

    }
}
