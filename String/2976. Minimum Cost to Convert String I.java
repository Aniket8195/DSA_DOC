class Solution {
    long INF=999999999;
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long dist[][]=new long[26][26];
        for(long []a:dist){
            Arrays.fill(a,INF);
        }
        for(int i=0;i<changed.length;i++){
              int src=original[i]-'a';
              int dest=changed[i]-'a';
             // dist[src][dest]=cost[i];
              dist[src][dest] = Math.min(dist[src][dest], cost[i]);
        }
        for (int i = 0; i < 26; i++) {
            dist[i][i] = 0;
        }

        for(int k=0;k<26;k++){
                 for(int i=0;i<26;i++){
                       for(int j=0;j<26;j++){
                          if(dist[i][k]+dist[k][j]<dist[i][j]){
                               dist[i][j]=dist[k][j]+dist[i][k];
                          }
                       }
                 }
        }
        if(source.length()!=target.length())return -1;
        long ans=0;
        int n=source.length();
        for(int i=0;i<n;i++){
           if (source.charAt(i) == target.charAt(i)) continue;
            int src = source.charAt(i) - 'a';
            int dest = target.charAt(i) - 'a';
            if (dist[src][dest] == INF) return -1;
            ans += dist[src][dest];
        }
        return ans; 
    }
}
