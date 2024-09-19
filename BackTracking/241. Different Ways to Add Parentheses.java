import java.util.*;

class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> nums = new ArrayList<>();
        List<Character> exp = new ArrayList<>();
        
        int num = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); 
            } else {
                nums.add(num); 
                num = 0;
                exp.add(c);    
            }
        }
        nums.add(num); 
        
        return solve(nums, exp, 0, nums.size() - 1);
    }

    private List<Integer> solve(List<Integer> nums, List<Character> exp, int start, int end) {
        List<Integer> res = new ArrayList<>();
        
        if (start == end) {
            res.add(nums.get(start));
            return res;
        }

        for (int i = start; i < end; i++) {
            List<Integer> left = solve(nums, exp, start, i);   
            List<Integer> right = solve(nums, exp, i + 1, end); 
            
            for (int l : left) {
                for (int r : right) {
                    res.add(s(l, r, exp.get(i)));
                }
            }
        }
        return res;
    }

    private int s(int a, int b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '/':
                return a / b;
            case '*':
                return a * b;
        }
        return 0; 
    }
}
