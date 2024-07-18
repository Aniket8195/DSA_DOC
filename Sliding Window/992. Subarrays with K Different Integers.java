import java.util.HashMap;

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostKDistinct(nums, k) - atMostKDistinct(nums, k - 1);
    }

    private int atMostKDistinct(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int l = 0, r = 0, count = 0;
        while (r < nums.length) {
            mp.put(nums[r], mp.getOrDefault(nums[r], 0) + 1);
            while (mp.size() > k) {
                mp.put(nums[l], mp.get(nums[l]) - 1);
                if (mp.get(nums[l]) == 0) {
                    mp.remove(nums[l]);
                }
                l++;
            }
            count += r - l + 1; // Count the number of subarrays ending at r with at most k distinct integers
            r++;
        }
        return count;
    }
}
