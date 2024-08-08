

//Works for both positives and negatives

class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
       Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        
        
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(sum==K){
                maxLen=Math.max(maxLen,i+1);
            }
            long rem=sum-K;
            
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }
    
    
}




//only works for positive
class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int a[], int n, int k) {
        //Complete the function
        int left=0;
        int right=0;
        int sum=0;
        int max=0;
        while(right<n){
            sum+=a[right];
            while(left<=right && sum>k){
                sum-=a[left];
                left++;
            }
            if(sum==k)max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
    
    
}
