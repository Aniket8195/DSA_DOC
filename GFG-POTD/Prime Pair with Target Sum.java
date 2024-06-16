class Solution {
    public static ArrayList<Integer> getPrimes(int n) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int l=1;
        int r=n-1;
        for(int i=0;i<=n/2;i++){
            if(prime(l)&&prime(r)){
                ans.add(l);
                ans.add(r);
                break;
            }
            l++;
            r--;
        }
        if(ans.size()==0){
            ans.add(-1);
            ans.add(-1);
        }
        return ans;
        
    }
    public static boolean prime(int val){
        
        if(val == 1) return false;
        
        for(int i = 2; i <= Math.sqrt(val); i++){
            if(val%i == 0) return false;
        }
        return true;
    }
}
