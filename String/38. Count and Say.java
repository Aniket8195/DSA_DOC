class Solution {
    public String countAndSay(int n) {
        if(n==1)return "1";  
        if(n==2)return "11";

        String s=countAndSay(n-1);

        StringBuilder sb=new StringBuilder();
        int l=0,r=0;
        char[]c=s.toCharArray();
        while(r<c.length){
            if(c[l]!=c[r]){
                sb.append(r-l).append(c[l]);
                l=r;
            }
            r++;
        }
        sb.append(r-l).append(c[l]);
        return sb.toString();       
    }
}
