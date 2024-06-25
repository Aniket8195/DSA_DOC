class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=t.length();
        int m=s.length();
        if(m>n)return false;
        if(s=="")return true;

        int j=0,i=0;

        while(j<m && i<n){
             if(s.charAt(j)==t.charAt(i)){
                   j++;
                   i++;
             }else{
                i++;
             }
        }
        if(j==m)return true;
        return false;
    }
}
