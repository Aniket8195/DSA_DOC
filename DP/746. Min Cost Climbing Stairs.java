class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        
        int prev=0;
        int cur=0;
        for(int i=2;i<=n;i++){
          int temp=prev;
          prev=cur;
          cur=Math.min(temp+cost[i-2],cur+cost[i-1]);
          
        }
        return cur;
    }
}
