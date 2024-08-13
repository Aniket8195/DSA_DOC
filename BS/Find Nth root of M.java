class Solution
{
    public int NthRoot(int n, int m)
    {
        // code here
          int left =1; 
        int right= m;
        while(left<=right)
        {
            int mid= (right-left)/2+left;
            if(Math.pow(mid,n)==m)
            return mid;
            else if(Math.pow(mid,n)>m)
            right = mid-1;
            else 
            left = mid+1;
        }
        return -1;
    }
}
