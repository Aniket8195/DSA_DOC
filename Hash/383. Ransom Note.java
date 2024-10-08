class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>hm=new HashMap<>();
        int n=ransomNote.length();
        int m=magazine.length();
        if(m<n)return false;
        for(int i=0;i<m;i++){
             hm.put(magazine.charAt(i),hm.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i=0;i<n;i++){
          if(!hm.containsKey(ransomNote.charAt(i))){
                 return false;
          }
          if(hm.get(ransomNote.charAt(i))==1){
                hm.remove(ransomNote.charAt(i));
          }
          else hm.put(ransomNote.charAt(i),hm.get(ransomNote.charAt(i))-1);
        }
        return true;
    }
}
