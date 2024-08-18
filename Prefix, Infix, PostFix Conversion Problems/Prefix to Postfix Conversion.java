class Solution {
    static String preToPost(String pre_exp) {
        // code here
          Stack<String> st = new Stack<>();
        
        for(int i=pre_exp.length()-1;i>=0;i--){
            char ch = pre_exp.charAt(i);
            int asci = (int)ch;
            if(asci >= 48 && asci <= 57 ||ch>='A' && ch<='Z'||ch>='a' && ch<='z'){
                st.push(ch+"");
            }else{
                String v1 = st.pop();
                String v2 = st.pop();
                char op = ch;
                String t = v1+v2+op;
                st.push(t);
            }
        }
        return st.peek();
    }
}
