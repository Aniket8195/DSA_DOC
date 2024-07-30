class Solution {
    public int minimumDeletions(String s) {
        int n=s.length();
        int aRight[]=new int [n];
        int bLeft[]=new int[n];
        s=s.toLowerCase();
        aRight[n-1]=0;
        for(int i=n-2;i>=0;i--){
            if(s.charAt(i+1)=='a'){
                   aRight[i]=aRight[i+1]+1;
            }else{
                aRight[i]=aRight[i+1];
            }
        }
        bLeft[0]=0;
        for(int i=1;i<n;i++){
           if(s.charAt(i-1)=='b'){
               bLeft[i]=bLeft[i-1]+1;
           }else{
                bLeft[i]=bLeft[i-1];
           }
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
           res=Math.min(res,bLeft[i]+aRight[i]);
        }
        return res;
    }
}
