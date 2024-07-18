class Solution { 
    // Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n) {
        Stack<Integer> st = new Stack<>();
        
        // Step 1: Push all the candidates into the stack.
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        
        // Step 2: Extract two candidates and compare them.
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            
            if (M[a][b] == 1) {
                // a knows b, so a cannot be the celebrity.
                st.push(b);
            } else {
                // a doesn't know b, so b cannot be the celebrity.
                st.push(a);
            }
        }
        
        // Step 3: The remaining person might be a celebrity.
        int candidate = st.pop();
        
        // Step 4: Verify the candidate.
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                // Candidate should not know i and i should know candidate.
                if (M[candidate][i] == 1 || M[i][candidate] == 0) {
                    return -1;
                }
            }
        }
        
        return candidate;
    }
}
