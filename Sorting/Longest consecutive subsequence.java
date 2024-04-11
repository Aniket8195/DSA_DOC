class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   Set<Integer>hs=new HashSet<>();
	   if (n == 0)
            return 0;

        int longest = 1;
	   for(int i=0;i<n;i++){
	       hs.add(arr[i]);
	   }
	   
	   for(Integer it:hs){
	       if(!hs.contains(it-1)){
	           int cnt=1;
	           int x=it;
	           while(hs.contains(x+1)){
	            x=x+1;
	            cnt++;
	           }
	           longest=Math.max(cnt,longest);
	           
	       }
	   }
	   return longest;
	   
	}
	
}
