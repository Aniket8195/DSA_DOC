class Solution {
    public boolean search(int[] nums, int target) {
        int r = nums.length -1;
        int l = 0;

        while(l <= r){
            int mid = l + (r -l)/2;
            if(nums[mid] == target) return true;
            
            if(nums[l] == nums[mid] && nums[mid] == nums[r]){
                l++;
                r--;
                continue;
            }
            if(nums[l] <= nums[mid]){
                if(target >= nums[l] && target <= nums[mid]) r = mid - 1;
                else l = mid + 1;
            }
            else if(nums[mid] <= nums[r]){
                if(target >= nums[mid] && target <= nums[r]) l = mid + 1;
                else r = mid -1;
            }

        }
        return false;
    }
}
