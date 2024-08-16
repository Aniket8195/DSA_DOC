class Solution {
    
       public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> result= new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        char ch[]={'0','1'};
        // sb.append('0');
        findAllPossible(ch,n, sb, result);
        
        return result;
  }
  
  public static void findAllPossible(char ch[],int n, StringBuilder sb, List<String> result){
      if(sb.length()==n){
          result.add(sb.toString());
          return;
      }
      for(int i=0;i<ch.length;i++){
          sb.append(ch[i]);
          // sb.charAt(sb.length()-2)=='1' && ch[i]=='1'
          // sb.substring(sb.length()-2) begIndex is provided .. It will read upto end length
          if(sb.length()>=2 && sb.charAt(sb.length()-2)=='1' && ch[i]=='1'){
              sb.deleteCharAt(sb.length()-1);
              continue;
          }
          findAllPossible(ch, n, sb, result);
          sb.deleteCharAt(sb.length()-1);
      }
  }
  
}
     
