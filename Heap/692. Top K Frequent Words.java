class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer>mp=new LinkedHashMap<>();
        for(int i=0;i<words.length;i++){
             mp.put(words[i],mp.getOrDefault(words[i],0)+1);
        }
        ArrayList<Pair>arr=new ArrayList<>();
        for(Map.Entry<String,Integer>entry:mp.entrySet()){
            arr.add(new Pair(entry.getKey(),entry.getValue()));
        }
        Collections.sort(arr,(p1,p2)->{
            if(p1.f!=p2.f){
              return p2.f-p1.f;
            }else{
               return p1.s.compareTo(p2.s); 
            }
        });
        List<String>ans=new ArrayList<>();
        for(int i=0;i<k;i++){
         ans.add(arr.get(i).s);
        }
        return ans;
    }

}
class Pair{
    String s;
    int f;
    Pair(String str,int fr){
        this.s=str;
        this.f=fr;
    }
}





//below solution is using priority queue

import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // Step 1: Count the frequency of each word
        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Step 2: Use a priority queue (min-heap) to keep the top k elements
        PriorityQueue<String> pq = new PriorityQueue<>((word1, word2) -> {
            int freqCompare = freqMap.get(word1) - freqMap.get(word2);
            if (freqCompare != 0) {
                return freqCompare; // Sort by frequency in ascending order
            } else {
                return word2.compareTo(word1); // Sort lexicographically in descending order
            }
        });

        // Step 3: Insert all words into the priority queue
        for (String word : freqMap.keySet()) {
            pq.offer(word);
            if (pq.size() > k) {
                pq.poll(); // Remove the word with the lowest frequency or lexicographically larger one
            }
        }

        // Step 4: Extract words from the priority queue (they'll be in reverse order)
        List<String> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        // Step 5: Since the words are in reverse order, reverse the result list before returning
        Collections.reverse(result);

        return result;
    }
}


// using linked hashmap
import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // Step 1: Count the frequency of each word using LinkedHashMap
        Map<String, Integer> freqMap = new LinkedHashMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Step 2: Sort the entries based on frequency and lexicographical order
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(freqMap.entrySet());
        Collections.sort(sortedList, (entry1, entry2) -> {
            if (!entry1.getValue().equals(entry2.getValue())) {
                return entry2.getValue() - entry1.getValue(); // Sort by frequency (desc)
            } else {
                return entry1.getKey().compareTo(entry2.getKey()); // Sort lexicographically (asc)
            }
        });

        // Step 3: Extract the top k frequent words
        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(sortedList.get(i).getKey());
        }

        return result;
    }
}
