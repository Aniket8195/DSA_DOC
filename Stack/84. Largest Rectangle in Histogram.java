class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int []>st=new Stack<>();
        int max=0;
        int n=heights.length;
        if(n==0)return max;
        st.push(new int[]{heights[0],0});
        for(int i=1;i<n;i++){
            int start=i;
            while(!st.isEmpty()&&st.peek()[0]>heights[i]){
                 int a[]=st.pop();
                 start=a[1];
                 max=Math.max(max,a[0]*(i-a[1]));
            }
            st.push(new int[]{heights[i],start});
        }
        while(!st.isEmpty()){
            int a[]=st.pop();
             max=Math.max(max,a[0]*(n-a[1]));
        }
        return max;
    }
}


















import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            while (stack.peek() != -1 && heights[i] <= heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        while (stack.peek() != -1) {
            int height = heights[stack.pop()];
            int width = heights.length - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
}
