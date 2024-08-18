class Solution {
    static String postToPre(String post_exp) {
        // code here
           Stack <String> s= new Stack<>();
        for(int i=0;i<post_exp.length();i++){
            char c= post_exp.charAt(i);
            if(Character.isLetter(c))s.push(String.valueOf(c));
            else{
                String v=s.pop();
                s.push(c+s.pop()+v);
                
            }
        }
        return s.pop();
    }
}
