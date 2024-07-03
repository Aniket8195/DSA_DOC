class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        String str=goal.concat(goal);
        return str.contains(s);
    }
}
