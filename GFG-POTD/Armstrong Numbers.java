class Solution {
    static String armstrongNumber(int n){
        // code here
          int N=n;
        int temp=0;
        while(n>0)
        {
            int rem=n%10;
            temp=temp+(rem*rem*rem);
            n=n/10;
        }
        if(temp==N){
            return "Yes";
        }
        return "No";
    }
}
