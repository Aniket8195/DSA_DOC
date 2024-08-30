class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left=0;
        int right=arr.length-1;
        while(right-left+1>k){
           if(Math.abs(arr[left]-x)<=Math.abs(arr[right]-x)){
             right--;
           }else{
            left++;
           }
        }
        List<Integer>ans=new ArrayList<>();
        while(left<=right){
          ans.add(arr[left]);
          left++;
        }
        return ans;
    }
}
