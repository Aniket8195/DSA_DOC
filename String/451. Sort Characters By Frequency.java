class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0;i<s.length();i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((p1,p2)-> p2.f-p1.f);
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
               pq.add(new Pair(entry.getKey(),entry.getValue()));
        }
        StringBuilder ans=new StringBuilder();
        while(!pq.isEmpty()){
          Pair p=pq.poll();
          int freq=p.f;
          char c=p.c;
          for(int i=0;i<freq;i++){
             ans.append(c);
          }
        }
        return ans.toString(); 
        
    }
}
class Pair{
    char c;
    int f;
    Pair(char cc,int ff){
        this.c=cc;
        this.f=ff;
    }
}
