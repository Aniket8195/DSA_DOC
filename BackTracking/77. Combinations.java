class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
        solve(res,cur,n,k,1);
        return res;
    }
    private void solve(List<List<Integer>>res,List<Integer>cur,int n,int k,int i){
       if(cur.size()==k){
           res.add(new ArrayList<>(cur));
           return;
       }
       if(i==n+1)return;
       cur.add(i);
       solve(res,cur,n,k,i+1);
       cur.remove(cur.size()-1);
       solve(res,cur,n,k,i+1);

    }
}
