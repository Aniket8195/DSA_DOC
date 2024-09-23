class Solution {
    public long validSubstringCount(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int c2[]=new int[26];
        Arrays.fill(c2,0);
        for(int i=0;i<n2;i++){
           c2[word2.charAt(i)-'a']++;
        }
        int c1[]=new int[26];
        Arrays.fill(c1,0);

        int left=0;
        int right=0;
        long count=0;
        int needed=n2;

        while(right<n1){
          char cur=word1.charAt(right);
          c1[cur-'a']++;
          if(c1[cur-'a']<=c2[cur-'a']){
            needed--;
          }

          while(needed==0){
            count+=(n1-right);
            char cc=word1.charAt(left);
            c1[cc-'a']--;
            if(c1[cc-'a']<c2[cc-'a']){
                 needed++;
            }
            left++;
          }
          right++;
        }
        return count;
    }
}
