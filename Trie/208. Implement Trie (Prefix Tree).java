class Trie {
    private TrieNode root;
     Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode cur=root;
        for(int i=0;i<word.length();i++){
              char c=word.charAt(i);
              if(cur.children[c-'a']==null){
                   cur.children[c-'a']=new TrieNode();
              }
              cur=cur.children[c-'a'];
        }
        cur.isEnd=true;
    }
    
    public boolean search(String word) {
        TrieNode cur=root;
        for(int i=0;i<word.length();i++){
              char c =word.charAt(i);
              if(cur.children[c-'a']==null) return false;
              cur=cur.children[c-'a'];
        }
        return cur.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode cur=root;
        for(int i=0;i<prefix.length();i++){
              char c =prefix.charAt(i);
              if(cur.children[c-'a']==null) return false;
              cur=cur.children[c-'a'];
        }
        return true;
    }
}
class TrieNode{
   TrieNode children[]=new TrieNode[26];
        boolean isEnd;
        TrieNode(){
            isEnd=false;
            for(int i=0;i<26;i++){
                      children[i]=null;
            }
        }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
