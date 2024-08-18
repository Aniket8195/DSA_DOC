class Solution {
    static String postToInfix(String exp) {
        // code here
          Stack<String> st = new Stack<>();
        int len = exp.length();
        for (int i = 0; i < len; i++) {
            char ch = exp.charAt(i);
            
            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                st.push(String.valueOf(ch));
            } else {
                String A = st.pop();
                String B = st.pop();
                String combined = "(" + B + ch + A + ")";
                st.push(combined);
            }
        }
        return st.pop();
    }
}
