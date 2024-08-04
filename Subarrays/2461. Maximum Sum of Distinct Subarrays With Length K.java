class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
     HashMap<Integer,Integer>hm=new HashMap<>();
       long ans=0;
        int start=0,end=0;
        long cur=0;
        while(end<nums.length){
           cur+=nums[end];
           hm.put(nums[end], hm.getOrDefault(nums[end], 0) + 1);
           end++;
           while(hm.size()>k ||end-start>k){
              cur -= nums[start];
                if (hm.containsKey(nums[start])) {
                    hm.put(nums[start], hm.get(nums[start]) - 1);
                    if (hm.get(nums[start]) == 0) {
                        hm.remove(nums[start]);
                    }
                }
                start++;
           }
           if(hm.size()==k){
           ans=Math.max(cur,ans);
           }
        }
        return ans;

    }
}
