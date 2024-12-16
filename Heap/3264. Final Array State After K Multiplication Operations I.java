class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((x,y)-> {
            if(nums[x]==nums[y]){
                  return x-y;
            }
            return nums[x]-nums[y];
        });

        for(int i=0;i<nums.length;i++){
            pq.add(i);
        }
        for(int i=0;i<k;i++){
           int j=pq.poll();
           nums[j]=nums[j]*multiplier;
           pq.add(j);
        }
        return nums;

    }
}
