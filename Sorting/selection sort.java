class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
           int min=i;
           for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[min]){
                    min=j;
                }
           }
           
           int tem=nums[i];
           nums[i]=nums[min];
           nums[min]=tem;
           
        }
        return nums;
    }
}
