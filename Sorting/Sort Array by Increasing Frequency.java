class Solution {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        HashMap<Integer,Integer>mp=new HashMap<>();
        PriorityQueue<int[]>pq=new PriorityQueue<>(
           (a, b) -> {
            if (a[1] != b[1])
                return a[1] - b[1];
            else
                return b[0] - a[0];
           }
        );
        for(int i=0;i<n;i++){
          mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>mpElement:mp.entrySet()){
            pq.add(new int[]{mpElement.getKey(),mpElement.getValue()});
        }
        int j=0;
        while(!pq.isEmpty()){
           int[] pair = pq.poll();
            int num = pair[0];
            int freq = pair[1];
          for(int i=0;i<freq;i++){
             ans[j++]=num;
          }
          
        }
        return ans;
    }
}
