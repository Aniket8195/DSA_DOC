class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((p1,p2)->p1.fre-p2.fre);
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
              pq.add(new Pair(entry.getKey(),entry.getValue()));
              if(pq.size()>k){
                  pq.poll();
              }
        }
        int ans[]=new int[k];
        int i=0;
        while(!pq.isEmpty()){
             ans[i++]=pq.poll().ele;
        }
        return ans;

    }
}
class Pair{
    int ele;
    int fre;
    Pair(int ele,int fre){
         this.ele=ele;
         this.fre=fre;
    }
}
