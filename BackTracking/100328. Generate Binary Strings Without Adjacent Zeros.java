class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        generate("", n, result);
        return result;
    }
    private void generate(String current, int n, List<String> result) {
        
        if (current.length() == n) {
            result.add(current);
            return;
        }
       if (canAppend(current, '0')) {
            generate(current + '0', n, result);
        }
        generate(current + '1', n, result);
        
    }
    private boolean canAppend(String current, char c) {
        int len = current.length();
        return len == 0 || (current.charAt(len - 1) != c);
    }
}
