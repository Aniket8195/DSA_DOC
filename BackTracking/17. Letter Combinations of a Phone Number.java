class Solution {
     public static void solve(String digits,Map<Character,String>map,String cur,int index,     ArrayList<String>ans){
           if(index>digits.length()) return;

           if(index==digits.length()){
                    if(cur!=""){
                      ans.add(cur);
                    }
                    return;
           }
           String s=map.get(digits.charAt(index));
           for(int i=0;i<s.length();i++){
               solve(digits,map,cur+s.charAt(i),index+1,ans);
           }
    }
    public List<String> letterCombinations(String digits) {
       ArrayList<String>ans=new ArrayList<>();
    //    if(digits.isEmpty()){
    //        return ans;
    //    }
       HashMap<Character,String>hm=new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
       
       solve(digits,hm,"",0,ans);
       return ans;   
    }
   
}
