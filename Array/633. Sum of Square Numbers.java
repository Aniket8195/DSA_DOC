class Solution {
    public boolean judgeSquareSum(int c) {
        long root=(long)Math.sqrt(c);
        
        long l=0,h=root;

        while(l<=h){
         long sq=l*l+h*h;
             if(sq==c){
                return true;
             }
             else if(sq>c){
                h--;
             }else{
                l++;
             }

        }
        return false;
    }
}
