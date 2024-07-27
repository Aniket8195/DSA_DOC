//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
       int sum=0;
        int i=2;
        n = n+1;
        while((i/2)<n){
            sum += (n/i) * (i/2) + Math.max((n%i)-(i/2),0);
            i *= 2;
        }
        return sum;
        
    }
}
