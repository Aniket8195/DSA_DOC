class Solution {
    public String simplifyPath(String path) {
        String[] components = path.split("/");
        Stack<String> st = new Stack<>();

        for (String comp : components) {
            if (comp.equals("") || comp.equals(".")) {
                continue;
            }

            if (comp.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(comp);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append("/");
            sb.append(st.pop());
        }

        String[] arr = sb.toString().split("/");
        StringBuilder result = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].isEmpty()) {
                result.append("/").append(arr[i]);
            }
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}
