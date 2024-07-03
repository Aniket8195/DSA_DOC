class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        hs.put('I', 1);
        hs.put('V', 5);
        hs.put('X', 10);
        hs.put('L', 50);
        hs.put('C', 100);
        hs.put('D', 500);
        hs.put('M', 1000);
        int n=s.length();
        int i=0;
        int sum=0;
        while(i<n){
           if(i<n-1 && hs.get(s.charAt(i))<hs.get(s.charAt(i+1))){
             int a=hs.get(s.charAt(i+1))-hs.get(s.charAt(i));
             sum+=a;
             i=i+2;
           }else{
            sum+=hs.get(s.charAt(i));
            i++;
           }
        }
        return sum;
    }
}
