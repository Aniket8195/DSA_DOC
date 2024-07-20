class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        if(n==0)return 0;
        int a=0,b=0;
        for(int i=0;i<n;i++){
               if(s.charAt(i)=='('){
                    a++;
               }else{
                if(a>0){
                      a--;
                }else{
                    b++;
                }
               }
        }
        return a+b;
    }
}
