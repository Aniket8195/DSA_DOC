class Solution {
    public String longestDiverseString(int a, int b, int c) {
        HashMap<Integer,Character>hm=new HashMap<>();
        hm.put(1,'a');
        hm.put(2,'b');
        hm.put(3,'c');
       StringBuilder sb=new StringBuilder();
        PriorityQueue<int []>pq=new PriorityQueue<>((a1,b1)->{
            return b1[1]-a1[1];
        });
        pq.add(new int[]{1,a});
        pq.add(new int[]{2,b});
        pq.add(new int[]{3,c});
        while(!pq.isEmpty()){
          int []cur=pq.poll();
          char ch=hm.get(cur[0]);
          if(sb.length()>0 && sb.charAt(sb.length()-1)!=ch){
             int size=Math.min(2,cur[1]);
             for(int i=0;i<size;i++){
                 sb.append(ch);
             }
             cur[1]-=size;
          }
          else if(sb.length()==0){
            int size=Math.min(2,cur[1]);
             for(int i=0;i<size;i++){
                 sb.append(ch);
             }
             cur[1]-=size;
          }else{
            if(pq.isEmpty())break;
            int cur1[]=pq.poll();
            int temp=Math.min(1,cur1[1]);
            for(int i=0;i<temp;i++){
                sb.append(hm.get(cur1[0]));
            }
            cur1[1]-=temp;
            if(cur1[1]>0)pq.add(new int[]{cur1[0],cur1[1]});
          }
          if(cur[1]>0)pq.add(new int[]{cur[0],cur[1]});
        }
        return sb.toString();
    }
}
