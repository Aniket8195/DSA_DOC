class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
           helper(0,cur,nums,res);
           return res;
    }
    public static void helper(int i,List<Integer>cur,int []nums,List<List<Integer>>res){
          if(i==nums.length) {
            res.add(new ArrayList<>(cur));//creating new list beacuse in java we pass lists by reference
            return;
          }
          cur.add(nums[i]);
          helper(i+1,cur,nums,res);
          cur.remove(cur.size()-1);
          helper(i+1,cur,nums,res);
    }
}
