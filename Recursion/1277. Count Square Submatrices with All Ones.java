// solution without caching

class Solution {
    public int countSquares(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               res+=solve(matrix,n,m,i,j);
            }
        }
        return res;
    }
    private int solve(int matrix[][],int n,int m,int r,int c){
         if(r==n || c==m ||matrix[r][c]==0){
            return 0;
         }
         int length=1+Math.min(
            solve(matrix,n,m,r+1,c),
            Math.min(
               solve(matrix,n,m,r,c+1),
               solve(matrix,n,m,r+1,c+1)
            )
         );
         return length;

    }
}


// using cache 

class Solution {
    Map<String, Integer> cache = new HashMap<>();

    public int countSquares(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               res+=solve(matrix,n,m,i,j);
            }
        }
        return res;
    }
    private int solve(int matrix[][],int n,int m,int r,int c){
         if(r==n || c==m ||matrix[r][c]==0){
            return 0;
         }
         String s=r+","+c;
         if(cache.containsKey(s)){
            return cache.get(s);
         }
         int length=1+Math.min(
            solve(matrix,n,m,r+1,c),
            Math.min(
               solve(matrix,n,m,r,c+1),
               solve(matrix,n,m,r+1,c+1)
            )
         );

         cache.put(s,length);
         return length;

    }
}





