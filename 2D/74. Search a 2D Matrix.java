class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int row=mat.length;
        int col=mat[0].length;
        int i=0;
        int j=col-1;
        while(i>=0 && j>=0 && j<col && i<row){
              int cur=mat[i][j];
              if(cur==target){
                       return true;
              }
              else if(cur<target){
                i++;
              }else {
                 j--;
              }
        }
        return false;
    }
}
