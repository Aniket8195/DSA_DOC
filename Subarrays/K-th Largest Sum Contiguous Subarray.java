class Solution {
    public static int kthLargest(int N, int K, int[] arr) {
        // code here
         ArrayList<Integer> result = new ArrayList<>();
        
        // Generate all subarrays
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum += arr[j];
                result.add(sum);
            }
        }

        // Sort in decreasing order
        Collections.sort(result,
                         Collections.reverseOrder());

        // return the Kth largest sum
        return result.get(K - 1);
    }
}
