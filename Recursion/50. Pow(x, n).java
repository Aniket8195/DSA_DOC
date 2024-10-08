class Solution {
    public double myPow(double x, int n) {
        return solve(x,n);
    }

    private double solve(double x,int n){
          if(n==0) return 1;
          
          if(n<0){
            if (n == Integer.MIN_VALUE) {
                n = Integer.MAX_VALUE;
                x = 1 / x;
                return solve(x * x, n / 2);
            }
            return 1.0/solve(x,-n);
          } 
          if(n%2==1){
                return x*solve(x*x,(n-1)/2);
          }else{
              return solve(x*x,n/2);
          }
          
    }
}
