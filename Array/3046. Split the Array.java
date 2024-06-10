class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int a=mp.getOrDefault(nums[i],0);
            mp.put(nums[i],a+1);
            if(a+1>2) return false;
        }
        return true;
    }
}
