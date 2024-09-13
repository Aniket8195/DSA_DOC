class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int answer[]=new int [queries.length];
        int i=0;
        for(int a[]:queries){
           answer[i++]=solve(a,arr);
        }
        return answer;
    }
    private int solve(int q[],int arr[]){
       int ans=arr[q[0]];
       for(int i=q[0]+1;i<=q[1];i++){
           ans^=arr[i];
       }
       return ans;
    }
}
