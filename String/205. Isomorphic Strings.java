class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>hm=new HashMap<>();
        char c='a';
        for(int i=0;i<s.length();i++){
           if(hm.containsKey(s.charAt(i))){
                  c=hm.get(s.charAt(i));
                  if(c!=t.charAt(i)){
                       return false;
                  }
           }else if(!hm.containsKey(s.charAt(i))){
            if(hm.containsValue(t.charAt(i))){
               return false;
            }
             hm.put(s.charAt(i),t.charAt(i));
           }else{
                  return false;
           }
        }
        return true;
    }
}
