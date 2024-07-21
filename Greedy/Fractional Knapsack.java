class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        double ans=0.0;
        PriorityQueue<Item> pq = new PriorityQueue<>((Item a,Item b) -> Double.compare((double) b.value/b.weight, (double) a.value/a.weight));
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        while(!pq.isEmpty()){
            Item item=pq.poll();
            if(item.weight<=W){
                ans+=item.value;
                W-=item.weight;
            }else{
                ans+=(double)(W*item.value)/item.weight;
                break;
            }
        }
        return ans;
    }
}
