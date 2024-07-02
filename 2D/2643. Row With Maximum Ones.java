class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row=0;
        int max=-1;
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<m;j++){
                 if(mat[i][j]==1){
                    cnt++;
                 }
            }
            if(cnt>max){
                  max=Math.max(max,cnt);
                  row=i;
            }
            
            cnt=0;
        }
        return new int[]{row,max};
    }
}
