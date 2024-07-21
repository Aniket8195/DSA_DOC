class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
       int start=intervals[0][0];
       int end=intervals[0][1];
       List<int[]>list=new LinkedList<>();
       int n=intervals.length;     
       for(int i=1;i<n;i++){
            if(end>=intervals[i][0]){
                 if(end<intervals[i][1]){
                     end=intervals[i][1];
                 }
                 continue;
            }
            list.add(new int[]{start,end});
            start=intervals[i][0];
            end=intervals[i][1];
       }
          list.add(new int[]{start,end});
        int[][] ans = new int[list.size()][2];
        int j = 0;

        for (int[] i : list) {
            ans[j][0] = i[0];
            ans[j][1] = i[1];
            j++;
        }

        return ans;
    }
}
