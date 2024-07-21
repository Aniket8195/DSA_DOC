class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        Meeting[] meetings = new Meeting[n];
        for (int i = 0; i < n; i++) {
            meetings[i] = new Meeting(start[i], end[i]);
        }

        Arrays.sort(meetings,(m1,m2)->m1.end-m2.end);
        int count=0;
        int lastEnd=-1;
        for(Meeting m:meetings){
             if(m.start>lastEnd){
                 count++;
                 lastEnd=m.end;
             }
        }
        return count;
        
    }
}
 class Meeting {
        int start, end;
        
        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
}
