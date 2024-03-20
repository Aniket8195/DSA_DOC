class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        Set<String>s=new HashSet<>();
        int len=wordList.size();
        for(int i=0;i<len;i++){
              s.add(wordList.get(i));
        }
        s.remove(beginWord);
        while(!q.isEmpty()){
              Pair p=q.poll();
              String word=p.first;
              int steps=p.second;
          //use .equals for strings
              if(word.equals(endWord)) return steps;

              for (int i = 0; i < word.length(); i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char replacedCharArray[] = word.toCharArray();
                    replacedCharArray[i] = ch;
                    String replacedWord = new String(replacedCharArray);

                    //check if it exists in the set and push it in the queue.
                    if (s.contains(replacedWord) == true) {
                        s.remove(replacedWord);
                        q.add(new Pair(replacedWord, steps + 1));
                    }
                }

            }
        }
            return 0;
    }
}
class Pair{
    String first;
    int second;
    Pair(String _first,int _second){
          this.first=_first;
          this.second=_second;
    }
}
