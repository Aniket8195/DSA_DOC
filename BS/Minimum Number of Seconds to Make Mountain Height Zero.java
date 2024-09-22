class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        // Binary search to find the minimum time
        long left = 1, right = (long) 1e18;

        // Perform binary search
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (canReduceToZero(mid, mountainHeight, workerTimes)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // Helper function to check if we can reduce the mountain height to zero in `mid` seconds
    private boolean canReduceToZero(long mid, int mountainHeight, int[] workerTimes) {
        long totalHeight = 0;

        for (int time : workerTimes) {
            long heightReduced = 0;
            long currentTime = time;

            // Check how much height the worker can reduce within 'mid' seconds
            long remainingTime = mid;
            while (remainingTime >= currentTime) {
                heightReduced++;
                remainingTime -= currentTime;
                currentTime += time;
                
                // Stop early if one worker can finish the entire job
                if (heightReduced >= mountainHeight) {
                    return true;
                }
            }
            
            totalHeight += heightReduced;
            if (totalHeight >= mountainHeight) {
                return true;
            }
        }
        return totalHeight >= mountainHeight;
    }
}
