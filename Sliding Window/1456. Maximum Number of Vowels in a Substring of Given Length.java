class Solution {
    public int maxVowels(String s, int k) {
        int ans=0,max=0;
        HashSet<Character>hs=new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');

       int left=0;
       int right=0;
       s=s.toLowerCase();
       while(right<s.length()){
         if(hs.contains(s.charAt(right))){
               ans++;
         }

         if(right-left+1>k){
          if(hs.contains(s.charAt(left))){
            ans--;
            
          }
          left++;
         }
         
         max=Math.max(ans,max);
         right++;
       }
       return max;
    }
}
