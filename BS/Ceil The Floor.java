class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
         Arrays.sort(arr);  // Sort the array first
        
        int floor = -1;
        int ceil = -1;
        
        // Binary search for floor
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= x) {
                floor = arr[mid];
                low = mid + 1;  // Move to the right half
            } else {
                high = mid - 1;  // Move to the left half
            }
        }
        
        // Binary search for ceil
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                ceil = arr[mid];
                high = mid - 1;  // Move to the left half
            } else {
                low = mid + 1;  // Move to the right half
            }
        }
        
        return new int[]{floor, ceil};
    }
}
