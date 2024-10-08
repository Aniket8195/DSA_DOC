class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
          ArrayList<Integer> res = new ArrayList<>();
        int count = 0;
        Stack<Integer> st = new Stack<>();
        char c[] = str.toCharArray();
        for(int i=0; i<c.length; i++){
            if(c[i] == '('){
                count++;
                res.add(count);
                st.push(count);
            }
            else if(c[i] == ')'){
                res.add(st.peek());
                st.pop();
            }
        }
        return res;
    }
};
