class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int res[]=new int[n+1];
        res[0]=0;
        HashSet<Character>hs=new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');

        for(int i=1;i<=n;i++){
          String s=words[i-1];
          if(hs.contains(s.charAt(0))&& hs.contains(s.charAt(s.length()-1))){
              res[i]=res[i-1]+1;
          }else{
            res[i]=res[i-1];
          }
        }
        int m=queries.length;
        int ans[]=new int [m];
        int j=0;
        for(int arr[]:queries){
          int s=arr[0];
          int e=arr[1];
          ans[j++]=res[e+1]-res[s];

        }
        return ans;
    }
}
