class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        HashSet<List<Integer>>hs=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int need=-nums[i];
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                if(nums[l]+nums[r]>need){
                  r--;
                }else if(nums[l]+nums[r]<need){
                 l++;
                }else{
                    List<Integer>list=new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r]));
                   hs.add(list);
                   l++;
                   r--;
                }
            }
        }
        ans.addAll(hs);
        return ans;
    }
}
