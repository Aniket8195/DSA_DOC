class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        solve(s);
    }
    private static void solve(Stack<Integer>s){
        if(s.isEmpty())return;
        int x=s.pop();
        solve(s);
        insertAtBottom(s, x);
    }
    private static void insertAtBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }

        int temp = s.pop();
        insertAtBottom(s, x);
        s.push(temp);
    }
}
