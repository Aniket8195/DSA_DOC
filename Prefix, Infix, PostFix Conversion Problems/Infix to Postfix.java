
class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        String res="";
        Stack<Character>s=new Stack<>();
        for(int i=0;i<exp.length();i++){
             char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                res+=c;
            }
            else if(c=='('){
                s.push(c);
            }else if(c==')'){
                while(s.isEmpty()==false && s.peek()!='('){
                    res+=s.peek();
                    s.pop();
                }
                if (!s.isEmpty() && s.peek() == '(') {
                    s.pop(); 
                }
                
            }
            else{
                while(s.isEmpty()==false && pre(c)<=pre(s.peek())){
                    res+=s.peek();
                    s.pop();
                }
                s.push(c);
            }
            
        }
         while (!s.isEmpty()) {
            res+= s.peek();
            s.pop();
        }
        return res;
    }
    static int pre(char c){
        switch(c){
            case '+':return 1;
            case '-':return 1;
            case '*':return 2;
            case '/':return 2;
            case '^':return 3;
        }
        return -1;
    }
}
