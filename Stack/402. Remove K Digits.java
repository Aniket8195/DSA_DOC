class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && k > 0 && st.peek() > num.charAt(i)) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        
        // If there are still k digits left to remove
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        
        // Build the resulting number from the stack
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        
        // Reverse the string to get the correct order
        String str = sb.reverse().toString();
        
        // Remove leading zeros
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        
        // If the resulting string is empty after removing leading zeros
        if (i == str.length()) {
            return "0";
        }
        
        return str.substring(i);
    }
}
