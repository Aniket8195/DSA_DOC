class Solution {
    public boolean isHappy(int n) {
        HashSet<String>hs=new HashSet<>();
        String cur=Integer.toString(n);
        while(!hs.contains(cur)){
               hs.add(cur);
               int sum=0;
               for(int i=0;i<cur.length();i++){
                       int digit=cur.charAt(i)-'0';
                       sum+=digit*digit;
               }
               if(sum==1)return true;
               cur=Integer.toString(sum);
        }
        return false;
    }
}
