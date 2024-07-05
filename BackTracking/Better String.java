class Solution {
    public static String betterString(String str1, String str2) {
        // Code here
        ArrayList<String>res1=new ArrayList<>();
        ArrayList<String>res2=new ArrayList<>();
        ArrayList<Character>cur1=new ArrayList<>();
        ArrayList<Character>cur2=new ArrayList<>();
        solve(res1,cur1,str1,0);
        solve(res2,cur2,str2,0);
        HashSet<String>hs1=new HashSet<>();
        HashSet<String>hs2=new HashSet<>();
        for(int i=0;i<res1.size();i++){
            hs1.add(res1.get(i));
        }
        for(int i=0;i<res2.size();i++){
            hs2.add(res2.get(i));
        }
        if(hs1.size()>hs2.size()){
            return str1;
        }else if(hs2.size()>hs1.size()){
            return str2;
        }else{
            return str1;
        }
    }
    private static void solve(ArrayList<String>res,ArrayList<Character>cur,String str,int i){
        if(cur.size()==str.length()){
            StringBuilder ss=new StringBuilder();
            for(int j=0;j<cur.size();j++){
                ss.append(cur.get(j));
            }
            res.add(ss.toString());
            return;
        }
        if(i==str.length())return;
        cur.add(str.charAt(i));
        solve(res,cur,str,i+1);
        cur.remove(cur.size()-1);
        solve(res,cur,str,i+1);
        
    }
}
