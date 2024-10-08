#approach 1
    class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
            solve(res,cur,k,n,1,0);
            return res;
    }
    private void solve(List<List<Integer>>res,List<Integer>cur,int k,int n,int i,int sum){
       if(cur.size()==k){
           if(sum==n){
              res.add(new ArrayList<>(cur));
           }
           return;
       }
       if(i>=10)return;
       cur.add(i);
       solve(res,cur,k,n,i+1,sum+i);
       cur.remove(cur.size()-1);
       solve(res,cur,k,n,i+1,sum);
    }
}




#approch 2
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
        solve(res,cur,k,n,1,0);
        return res;
    }
    private void solve(List<List<Integer>>res,List<Integer>cur,int k,int n,int i,int sum){
        if(sum==n && cur.size()==k){
              res.add(new ArrayList<>(cur));
              return;
        }
        if(sum>n || cur.size()==k || i==10) return;
        cur.add(i);
        solve(res,cur,k,n,i+1,sum+i);
        cur.remove(cur.size()-1);
        solve(res,cur,k,n,i+1,sum);
    }
}
