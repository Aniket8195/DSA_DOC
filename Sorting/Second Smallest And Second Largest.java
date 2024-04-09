public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>first){
                second=first;
                first=a[i];
            }
            else if(a[i]>second && a[i]!=first){
                  second=a[i];
            }
        }
        int firstSmall=Integer.MAX_VALUE,secondSmall=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
           if(a[i]<firstSmall){
           secondSmall=firstSmall;
           firstSmall=a[i];
           }else if(a[i]<secondSmall && a[i]!=firstSmall){
               secondSmall=a[i];
           }
        }
        return new int[]{second,secondSmall};
    }
}
