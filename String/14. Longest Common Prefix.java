class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min_length=Integer.MAX_VALUE;
        for(String s:strs){
              min_length=Math.min(min_length,s.length());
        }
        int i=0;
        StringBuilder ans=new StringBuilder("");
        while(i<min_length){
          for(String s:strs){
            if(s.charAt(i)!=strs[0].charAt(i)){
             return ans.toString();
            }
          }
          ans.append(strs[0].charAt(i));
          i++;
        }
        return ans.toString();
    }
}
