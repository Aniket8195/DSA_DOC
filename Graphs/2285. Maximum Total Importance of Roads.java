class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int edgeCount[]=new int[n];

        for(int road[]:roads){
           edgeCount[road[0]]++;
           edgeCount[road[1]]++;
        }
        Arrays.sort(edgeCount);
        long label=1;
        long res=0;
        for(int i=0;i<n;i++){
           res+=label*edgeCount[i];
           label++;
        }
        return res;
    }
}
