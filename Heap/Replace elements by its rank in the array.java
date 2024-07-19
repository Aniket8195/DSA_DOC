class Solution {
    static int[] replaceWithRank(int arr[], int n) {
     // code here
   PriorityQueue<Integer>pq=new PriorityQueue<>();
   for(int i=0;i<n;i++){
       pq.add(arr[i]);
   }
   int temp=1;
   HashMap<Integer,Integer>hm=new HashMap<>();
   while(!pq.isEmpty()){
       int x=pq.poll();
       if(!hm.containsKey(x)){
           hm.put(x,temp);
           temp++;
       }
   }
   
   for(int i=0;i<n;i++){
       arr[i]=hm.get(arr[i]);    
   }
   return arr;
  }
}
