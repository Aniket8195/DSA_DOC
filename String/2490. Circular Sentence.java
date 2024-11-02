class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.trim().split(" ");
        int n = arr.length;

       
        for (int i = 0; i < n; i++) {
            String currentWord = arr[i];
            String nextWord = arr[(i + 1) % n]; 

           
            if (currentWord.charAt(currentWord.length() - 1) != nextWord.charAt(0)) {
                return false;
            }
        }

        return true; 

    }
}
