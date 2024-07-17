class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        int res[]=new int[n];
        Stack<Integer>st=new Stack<>();
        st.push(nums2[n-1]);
        res[n-1]=-1;
        for(int i=n-2;i>=0;i--){
               while(!st.isEmpty() && st.peek()<=nums2[i]){
                     st.pop();
               }
               if(st.isEmpty())res[i]=-1;
               else res[i]=st.peek();
               st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<n;j++){
                 if(nums1[i]==nums2[j]){
                     nums1[i]=res[j];
                     break;
                 }
            }
        }
        return nums1;
    }
}
