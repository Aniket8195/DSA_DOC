class Solution {
    public int fib(int n) {
        int prv=0,cur=1;
        for(int i=2;i<=n;i++){
            int temp=cur;
            cur=cur+prv;
            prv=temp;
        }
        if(n==0) return 0;
        return cur;
    }
}
