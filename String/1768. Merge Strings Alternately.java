class Solution {
    public String mergeAlternately(String word1, String word2) {
     int l1=word1.length();
     int l2=word2.length();
     int a=0,b=0;
     int take=1;
     StringBuilder sb=new StringBuilder();
     while(a<l1 && b<l2){
          if(take==1){
            sb.append(word1.charAt(a));
            a++;
            take--;
          }else{
             sb.append(word2.charAt(b));
             b++;
             take++;
          }
     }
     while(a<l1){
          sb.append(word1.charAt(a));
          a++;
     }  
     while(b<l2){
          sb.append(word2.charAt(b));
          b++;
     } 
     return sb.toString();
    }
}
