class Solution {

    static int arr[];
    static boolean helper(long x, long h){
        long ans = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            ans = ans + (long)(Math.ceil((double)arr[i]/(double)x));
        }
        if(ans<=h) return true;
        else return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        arr = piles;
        long st = 1;
        long max=Long.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
           max=Math.max(max,piles[i]);
        }
        long end = max;
        long ans = -1;
        while(st<=end){
            long mid = st+(end-st)/2;
            if(helper(mid,(long)h)){
                ans = mid;
                end = mid-1;
            }else st = mid+1;
        }
        return (int)ans;
    }
}
