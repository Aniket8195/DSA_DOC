class Solution {
    static String preToInfix(String s) {
        // code here
         int n = s.length(), i = n - 1;
        Stack<String> st = new Stack<>();
        
        while( i >= 0 ){
            char ch = s.charAt(i);
            if ( Character.isLetterOrDigit(ch)) st.push(Character.toString(ch));
            else {
                String t1 = st.pop();
                String t2 = st.pop();
                String con = "(" + t1 + ch + t2 + ")";
                st.push(con);
            }
            i--;
        }
        return st.pop();
    }
}
