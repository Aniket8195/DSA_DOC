class Solution {
    public double averageWaitingTime(int[][] customers) {
        double time=0;
        double sum=0;
        int i=0;
        int n=customers.length;
        while(i<n){
          int []person=customers[i];
          if(person[0]<=time){
               sum=sum+time+person[1]-person[0];
               time=time+person[1];
               i++;
          }else{
            time++;
          }

          
        }
        return (double)sum/n;
    }
}
