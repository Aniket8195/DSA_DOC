class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>>hs=new HashSet<>();
        ArrayList<Integer>cur=new ArrayList<>();
        Arrays.sort(nums);
        solve(hs,cur,nums,0);
        List<List<Integer>>res=new ArrayList<>();
        for(List<Integer>a:hs){
                 res.add(a);
        }
        return res;
    }
    private void solve(HashSet<List<Integer>>hs,ArrayList<Integer>cur,int[]nums,int i){
        if(i==nums.length){
              hs.add(new ArrayList<>(cur));
              return;
        }
        cur.add(nums[i]);
        solve(hs,cur,nums,i+1);
        cur.remove(cur.size()-1);
        solve(hs,cur,nums,i+1);
    }
}
