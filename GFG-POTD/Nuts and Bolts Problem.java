class Solution {
    void matchPairs(int n, char nuts[], char bolts[]) {
       HashMap<Character, Integer> mp = new HashMap<>();
        List<Character> ar = Arrays.asList('!', '#', '$', '%', '&', '*', '?', '@', '^');
        
        for (int i = 0; i < ar.size(); i++) {
            mp.put(ar.get(i), i);
        }
        
        int[] arr = new int[9]; 
        
        for (int i = 0; i < n; i++) {
            arr[mp.get(nuts[i])] = 1;
        }
        
        int j = 0;
        for (int i = 0; i < 9; i++) {
            if (arr[i] == 1) {
                nuts[j] = ar.get(i);
                bolts[j] = ar.get(i);
                j++;
            }
        }
    }
}
