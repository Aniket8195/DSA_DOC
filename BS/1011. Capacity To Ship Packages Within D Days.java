class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=0;
        int sum=0;
        for(int i=0;i<weights.length;i++){
              sum+=weights[i];
        }
        int ans=-1;
        int end=sum;
        while(start<=end){
           int mid=start+(end-start)/2;
           if(isPossible(weights,days,mid)){
                 ans=mid;
                 end=mid-1;
           }else{
            start=mid+1;
           }
        }
        return ans;
    }
    private boolean isPossible(int []weights,int days,int mid){
       int dayCount=1;
       int daySum=0;
       for(int i=0;i<weights.length;i++){
             if(daySum+weights[i]<=mid){
               daySum+=weights[i];
             }
             else{
                dayCount++;
                if(dayCount>days || weights[i]>mid)return false;
                daySum=weights[i];
             }

       }       
       return true;
    }
}
