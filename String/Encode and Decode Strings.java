class Solution {

    public String encode(String s[]) {
        StringBuilder sb = new StringBuilder();
        
        for (String str : s) {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        
        return sb.toString();
    }

    public String[] decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {

            
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(s.substring(i, j));

           
            String word = s.substring(j + 1, j + 1 + len);
            res.add(word);


            i = j + 1 + len;
        }

        return res.toArray(new String[0]);
    }
}
