class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
           Arrays.fill(ans[i],-1);
        }

        int top=0,bottom=m-1,left=0,right=n-1;

        while(head!=null){
          for(int col=left;col<=right &&head!=null;col++){
               ans[top][col]=head.val;
               head=head.next;
          }
          top++;
          for(int row=top;row<=bottom && head!=null ;row++){
              ans[row][right]=head.val;
              head=head.next;
          }
          right--;

          if(right>=left){
             for(int col=right;col>=left &&head!=null;col--){
            ans[bottom][col]=head.val;
            head=head.next;
          }
          bottom--;
          }

          if(bottom>=top){
               for(int row=bottom;row>=top && head!=null ;row--){
               ans[row][left]=head.val;
               head=head.next;
          }
          left++;
          }

        }
        return ans;

    }
}
