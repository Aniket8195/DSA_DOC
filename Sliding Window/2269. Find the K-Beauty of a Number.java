class Solution {
    public int divisorSubstrings(int num, int k) {
        char [] s = String.valueOf(num).toCharArray();
        int count = 0;
        for(int i = 0 ; i<=s.length - k; i++){
            int divisor = getNumber(k,s,i);
            if(divisor != 0 && num%divisor== 0){
                count++;
            }
        }
        return count;
    }

    private int getNumber(int k, char [] s, int start){
        int num = 0;
        while(k >0){
            num = num*10;
            num = (s[start]-'0')+num;
            start++;
            k--;
        }
        return num;
    }
}
