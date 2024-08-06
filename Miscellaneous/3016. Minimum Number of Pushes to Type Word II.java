class Solution {
    public int minimumPushes(String word) {
        int count[]=new int[26];
        Arrays.fill(count,0);
        for(int i=0;i<word.length();i++){
           count[word.charAt(i)-'a']++;
        }
        Arrays.sort(count);
        int res=0;
        for(int i=0;i<26;i++){
             res+=count[26-i-1]*(1+(i/8));
        }
        return res;
    }
}
