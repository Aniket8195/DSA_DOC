
class GfG
{
    int maxLen(int arr[], int n)
    {
         HashMap<Integer,Integer>mp=new HashMap<>();
         int sum=0;
         int max=0;
         for(int i=0;i<n;i++){
             sum+=arr[i];
             if(sum==0){
                 max=i+1;
             }else{
                 if(mp.containsKey(sum)){
                     max=Math.max(max,i-mp.get(sum));
                 }else{
                     mp.put(sum,i);
                 }
             }
             
         }
         return max;
    }
}
