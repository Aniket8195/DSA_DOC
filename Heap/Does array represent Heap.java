class Solution {
    
    public boolean countSub(long arr[], long n)
    {
        // Your code goes here
        int i = 0;
        while(i < n){
            if((2*i+1<n && arr[i] < arr[(2*i) + 1]) || (2*i+2<n && arr[i] < arr[2*i + 2]))
            return false;
            i++;
        }
        return true;
    }
}
