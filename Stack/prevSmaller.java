public class Solution {

    public int[] prevSmaller(int[] A) {

        Stack<Integer> st = new Stack<>();

        int [] arr = new int[A.length];



        for(int i=0;i<A.length;i++){

            while(!st.isEmpty() && st.peek()>=A[i]){

                st.pop();

            }

            if(!st.isEmpty()){

                arr[i] = st.peek();

            }else{

                arr[i]= -1;

            }

            st.push(A[i]);

        }

        

        return arr;

    }

}
