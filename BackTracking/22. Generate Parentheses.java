class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        List<Character>cur=new ArrayList<>();
        solve(res,cur,n,0,0);
        return res;
    }
    private void solve(List<String>res,List<Character>cur,int n,int open , int close){
          if(close == open && close + open == n * 2){
                StringBuffer st=new StringBuffer();
                for(int i=0;i<cur.size();i++){
                      st.append(cur.get(i));
                }
                res.add(st.toString());
                return;
          }
          if(open<n){
            cur.add('(');
               solve(res,cur,n,open+1,close);
               cur.remove(cur.size() - 1);
          }
          if(close<open){
              cur.add(')');
              solve(res,cur,n,open,close+1);
              cur.remove(cur.size() - 1);
          }
    }
}
