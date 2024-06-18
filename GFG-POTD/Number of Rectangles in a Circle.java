class Solution {
    int rectanglesInCircle(int r) {
        // code here
        double d=r*2;
            int cnt=0;
            double area=3.14*r*r;
            for(int i=1;i<=d;i++){
                for(int j=1;j<=d;j++){
                    double tempArea=i*j;
                    double diag=Math.sqrt(i*i+j*j);
                    if(tempArea<=area && d>=diag)cnt++;
                }
            }
            return cnt;
    }
};
