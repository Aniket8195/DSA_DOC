class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        if (nums == null || nums.length == 0) {
            return ans;
        }
        
        int left = findLeft(nums, target);
        if (left == -1) {
            return ans; // Target not found
        }
        int right = findRight(nums, target, left);
        
        ans[0] = left;
        ans[1] = right;
        return ans;
    }
    
    private int findLeft(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l+r) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (l < nums.length && nums[l] == target) {
            return l;
        }
        return -1;
    }
    
    private int findRight(int[] nums, int target, int left) {
        int l = left, r = nums.length - 1;
        while (l <= r) {
            int mid = (l+r) / 2;
            if (nums[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }
}
