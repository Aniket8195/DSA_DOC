class Solution {
    public static int totalFruits(int N, int[] fruits) {
        int i=0;
        int j=0;
        int n=fruits.length;
        int ans=Integer.MIN_VALUE;
        HashMap<Integer,Integer> hs=new HashMap<>();
        while(j<n){
            int m=fruits[j];
            if(hs.containsKey(m)){
                hs.put(m,hs.get(m)+1);
            }
            else if(!hs.containsKey(m) && hs.size()<2){
                hs.put(m,1);
            }
            else if(!hs.containsKey(m) && hs.size()==2){
                while(hs.size()!=1){
                    if(hs.get(fruits[i])>0){
                        hs.put(fruits[i],hs.get(fruits[i])-1);
                
                    if(hs.get(fruits[i])==0){
                        hs.remove(fruits[i]);
                    }
                    }
                    i++;
                   // System.out.println(hs);
                }
                hs.put(m,1);
            }
            ans=Math.max(ans,j-i+1);
        j++;
        }
        return ans;
    }
}
