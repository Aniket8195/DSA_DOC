class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int platform_needed = 1;
        int max_platforms = 1;
        int i = 1; // Pointer for arrival
        int j = 0; // Pointer for departure
        
        // Traverse through all arrival and departure times
        while (i < n && j < n) {
            // If next event is arrival, increment platform_needed
            if (arr[i] <= dep[j]) {
                platform_needed++;
                i++;
            } 
            // If next event is departure, decrement platform_needed
            else {
                platform_needed--;
                j++;
            }
            
            // Update the maximum platforms needed
            if (platform_needed > max_platforms) {
                max_platforms = platform_needed;
            }
        }
        
        return max_platforms;
        
    }
    
}
