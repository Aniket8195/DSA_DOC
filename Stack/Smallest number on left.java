class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        Stack<Integer> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= a[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans.add(-1);
            } else {
                ans.add(st.peek());
            }
            st.push(a[i]);
        }
        
        return ans;
    }
}
