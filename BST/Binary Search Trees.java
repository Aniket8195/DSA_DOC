class Solution {
    static boolean isBSTTraversal(int A[]) {
        // code here
          int n=A.length; boolean flag = false;
        for(int i=0;i<n-1;i++){
            if(A[i]<A[i+1])
                flag = true;
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }
}
