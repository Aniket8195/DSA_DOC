class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        int x=1<<(k);
        
        if((n&x)!=0){
            return true;
        }
        return false;
    }
    
}
