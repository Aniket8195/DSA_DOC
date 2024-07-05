class Solution {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
       
        solve(res,n,0,0,arr);
        return res;
    }
    private void solve(ArrayList<Integer>res,int n,int i,int sum,ArrayList<Integer> arr){
        if(i==n){
            res.add(sum);
            return;
        }
    
        solve(res,n,i+1,sum+arr.get(i),arr);
        
        solve(res,n,i+1,sum,arr);
    }
}
