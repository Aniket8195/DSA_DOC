class Solution
{
    //Function to print the sum of frequencies of k numbers
    //with most occurrences in an array.
    int kMostFrequent(int arr[], int n, int k){
        TreeMap<Integer,Integer>tp=new TreeMap<>();
        for(int i=0;i<n;i++){
            tp.put(arr[i],tp.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(Map.Entry<Integer,Integer>e:tp.entrySet()){
            pq.add(e.getValue());
        }
        int ans=0;
        for(int i=0;i<k;i++){
            ans+=pq.poll();
        }
        return ans;
    }
}
