class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> charStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == ')') {
                StringBuilder temp = new StringBuilder();
                while (charStack.peek() != '(') {
                    temp.append(charStack.pop());
                }
                charStack.pop(); // Remove the '('

                for (char rc : temp.toString().toCharArray()) {
                    charStack.push(rc);
                }
            } else {
                charStack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            result.append(charStack.pop());
        }

        return result.reverse().toString();
    }
}
