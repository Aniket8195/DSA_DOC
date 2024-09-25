class TrieNode{
    TrieNode []children;
    int count;
    TrieNode(){
        children=new TrieNode[26];
        count=0;
    }
}
class Solution {
    TrieNode root;
    private void add(String s){
        TrieNode node=root;
         for(char c:s.toCharArray()){
              if(node.children[c-'a']==null){
                 node.children[c-'a']=new TrieNode();
              }
          node=node.children[c-'a'];
          node.count+=1;
         }
    }
    private int get(String s){
        int ans=0;
        TrieNode node=root;
        for(char c:s.toCharArray()){
           node=node.children[c-'a'];
           ans+=node.count;
        }
        return ans;

    }
    public int[] sumPrefixScores(String[] words) {
        root=new TrieNode();
        for(int i=0;i<words.length;i++){
              add(words[i]);
        }
        int ans[]=new int[words.length];
        for(int i=0;i<words.length;i++){
          ans[i]=get(words[i]);
        }
        return ans;
    }
}
