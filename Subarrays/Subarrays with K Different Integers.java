class Solution {
    static int subarrayCount(int arr[], int n, int k) {
    // code here
    return solve(k,n,arr)-solve(k-1,n,arr);
    

  }
  static int solve(int k,int n,int arr[]){
      int start=0,end=0;
    HashMap<Integer,Integer>hm=new HashMap<>();
    int res=0;
    while (end < n) {
            // Add the current element to the map or update its count
            hm.put(arr[end], hm.getOrDefault(arr[end], 0) + 1);
            end++;

            // Check if the current window has more than k distinct elements
            while (hm.size() > k) {
                hm.put(arr[start], hm.get(arr[start]) - 1);
                if (hm.get(arr[start]) == 0) {
                    hm.remove(arr[start]);
                }
                start++;
            }

            // If the current window has exactly k distinct elements, count the subarrays
            
                res += (end - start);
            
        }
        return res;
  }
}
     
