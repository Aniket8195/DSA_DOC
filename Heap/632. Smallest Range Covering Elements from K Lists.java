class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int k=nums.size();
        int left=nums.get(0).get(0),right=nums.get(0).get(0);

        PriorityQueue<int []>pq=new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for(int i=0;i<k;i++){
         left=Math.min(left,nums.get(i).get(0));
         right=Math.max(right,nums.get(i).get(0));
         pq.add(new int[]{nums.get(i).get(0),i,0});
        }
        
        int []res={left,right};

        while(true){
         int ans[]=pq.poll();
         int list=ans[1];
         int idx=ans[2];
         idx++;

         if(idx==nums.get(list).size())break;

         int nextVal=nums.get(list).get(idx);

         pq.add(new int[]{nextVal,list,idx});

          right=Math.max(right,nextVal);
          left = pq.peek()[0];

          if((right-left)<(res[1]-res[0])){
            res=new int[]{left,right};
          }

        }
        
        return res;
    }
}
