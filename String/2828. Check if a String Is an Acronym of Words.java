class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder str=new StringBuilder();
       
        for(String w:words){
         str.append(w.charAt(0));
        }
       return str.toString().equals(s);
        
    }
}
