class Solution {
    int count(int[] arr, int n, int x) {
        int l=left(arr,x);
        int r=right(arr,x,l);
        if(l==-1 || r==-1){
            return 0;
        }
        return Math.abs(r-l)+1;
        
    }
    public static int left(int []nums,int x){
        int l=0;
        int r=nums.length-1;
        
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]<x){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        if(l<nums.length && nums[l]==x){
            return l;
        }
        return -1;
    }
    public static int right(int []nums,int x,int left){
        int l = 0;
        int r = nums.length - 1;
        
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (r >= 0 && nums[r] == x) {
            return r;
        }
        return -1;
    }

    
    
}
