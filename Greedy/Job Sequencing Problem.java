class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
       Arrays.sort(arr, (j1, j2) -> j2.profit - j1.profit);
        int totalp=0;
         boolean[] slot = new boolean[n];
         int[] result = new int[2];
        Arrays.fill(slot, false);
        
         int maxProfit = 0;
        int jobCount = 0;
        
        for (Job job : arr) {
            // Find a free slot for this job (if available)
            for (int j = Math.min(n, job.deadline) - 1; j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    maxProfit += job.profit;
                    jobCount++;
                    break;
                }
            }
        }
        result[0] = jobCount;
        result[1] = maxProfit;
        return result;
    }
}
