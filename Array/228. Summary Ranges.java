import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> ans = new ArrayList<>();
        if (nums.length == 0) {
            return ans;
        }
        
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 || nums[i + 1] != nums[i] + 1) {
                if (start == i) {
                    ans.add(nums[start] + "");
                } else {
                    ans.add(nums[start] + "->" + nums[i]);
                }
                start = i + 1; 
            }
        }
        return ans;
    }
}
