class Solution {
    public long maxKelements(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<n;i++){
          pq.add(nums[i]);
        }
        long res=0;

        for(int i=0;i<k;i++){
           int x=pq.poll();
           res+=(long)x;
           pq.add((int)(x+2)/3);
        }

        return res;
    }
}
