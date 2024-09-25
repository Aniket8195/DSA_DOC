class TrieNode {
    TrieNode[] children;

    TrieNode() {
        children = new TrieNode[10]; 
    }
}

class Solution {
    TrieNode root;

    private void add(int num) {
        TrieNode node = root;
        String strNum = String.valueOf(num);  
        for (char ch : strNum.toCharArray()) {
            int n = ch - '0';  
            if (node.children[n] == null) {
                node.children[n] = new TrieNode();
            }
            node = node.children[n];
        }
    }

    private int search(int num) {
        TrieNode node = root;
        String strNum = String.valueOf(num);  
        int i = 0;
        for (char ch : strNum.toCharArray()) {
            int n = ch - '0';
            if (node.children[n] == null) {
                return i;  
            }
            node = node.children[n];
            i++;
        }
        return i;  
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        root = new TrieNode();
        for (int num : arr1) {
            add(num);  
        }

        int max = 0;
        for (int num : arr2) {
            max = Math.max(search(num), max);  
        }
        return max;
    }
}
