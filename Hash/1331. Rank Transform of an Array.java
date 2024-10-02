class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int ans[]=arr.clone();
        Arrays.sort(arr);
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
           if(!hm.containsKey(arr[i])){
              hm.put(arr[i],hm.size()+1);
           }
        }
        for(int i=0;i<arr.length;i++){
           ans[i]=hm.get(ans[i]);

        }
        return ans;
    }
}
