class Solution {
  public static int[] count_NGEs(int n, int arr[], int q, int ind[]) {
    // code here
      int [] ans= new int[q];
      for(int i=0;i<q;i++){
          int curr=arr[ind[i]];
          Stack<Integer> st = new Stack<>();
          int r=n-1;
          while(r>ind[i]){
              if(arr[r]>curr){
                  st.push(arr[r]);
              }
              r--;
          }
          ans[i]=st.size();
      }
      return ans;
  }
}
