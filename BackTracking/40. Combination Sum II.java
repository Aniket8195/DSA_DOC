class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
        Arrays.sort(candidates);// for making easier to skip duplicate elements 
        solve(res,cur,candidates,target,0,0);
        return res;
    }
    private void solve(List<List<Integer>>res,List<Integer>cur,int []candidates,int target,int i,int sum){
        if(sum==target){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(sum>target || i>=candidates.length){
                return;
        }
        cur.add(candidates[i]);
        solve(res,cur,candidates,target,i+1,sum+candidates[i]);
        cur.remove(cur.size()-1);
        int nextIndex = i + 1;
        //to skip the duplicate elements find next index which is not same element
        while (nextIndex < candidates.length && candidates[nextIndex] == candidates[i]) {
            nextIndex++;
        }
        solve(res,cur,candidates,target,nextIndex,sum);
    }
}
