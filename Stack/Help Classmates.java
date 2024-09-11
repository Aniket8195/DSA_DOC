//code for next smaller element


class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	    Stack<Integer>st=new Stack<>();
	    int ans[]=new int[arr.length];
	    Arrays.fill(ans,-1);
	    for(int i=0;i<arr.length;i++){
	        while(!st.isEmpty() && arr[st.peek()]>arr[i]){
	            int x=st.peek();
	            st.pop();
	            ans[x]=arr[i];
	        }
	        st.push(i);
	    }
	    return ans;
	} 
}
