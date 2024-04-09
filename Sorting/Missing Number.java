class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        boolean vis[]=new boolean[n+1];
        for(int i=0;i<n;i++){
            vis[nums[i]]=true;
        }
        for(int i=0;i<=n;i++){
           if(vis[i]==false){
             return i;
           }
        }
        return -1;
    }
}
