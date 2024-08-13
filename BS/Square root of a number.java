

/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
            long low=1,high=x,ans=-1;
            
            while(low<=high){
                long mid=(low+high)/2;
                long msq=mid*mid;
                if(msq>x){
                    high=mid-1;
                }else if(msq==x){
                    return mid;
                }
                else{
                    low=mid+1;
                    ans=mid;
                }
            }
            return ans;
	 }
}
