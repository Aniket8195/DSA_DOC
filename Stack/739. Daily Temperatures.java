class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<int []>st=new Stack<>();
        int n=temp.length;
        int []ans=new int[n];
        int i=1;
        st.push(new int[]{temp[0],0});
        while(!st.isEmpty()&& i<n){
             while(!st.isEmpty()&&st.peek()[0]<temp[i]){
                 int cur[]=st.pop();
                 ans[cur[1]]=i-cur[1];
             }
             st.push(new int[]{temp[i],i});
             i++;
        }
        return ans;        
    }
}
