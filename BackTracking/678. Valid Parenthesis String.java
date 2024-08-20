class Solution {
    public boolean checkValidString(String s) {
        return solve(s,0,0);
    }
    private boolean solve(String s,int index,int count){
          if(count<0){
              return false;
          }
          if(index==s.length()){
           return count==0;
          }
         
          char ch = s.charAt(index);
        if (ch == '(') {
            return solve(s, index + 1, count + 1);
        } else if (ch == ')') {
            return solve(s, index + 1, count - 1);
        } else {
            return solve(s, index + 1, count + 1) || 
            solve(s, index + 1, count - 1) || 
            solve(s, index +1,count);
        }
    }
}
