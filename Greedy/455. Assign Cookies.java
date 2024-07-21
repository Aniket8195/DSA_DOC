class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0;
        int r=0;
        int n=g.length;
        int m=s.length;
        while(r<m && l<n){
          if(g[l]<=s[r]){
              l++;
          }
          r++;
        }
        return l;
    }
}
