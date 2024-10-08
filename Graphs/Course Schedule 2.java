class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // Adjacency List
        List[] adjList = new List[numCourses];
        int[] indegree = new int[numCourses];

        // Remember, 1 -> 0 means 0 before 1 (for this question)
        for(int[] preq: prerequisites) {
            if(adjList[preq[1]]==null) adjList[preq[1]] = new ArrayList<Integer>();
            adjList[preq[1]].add(preq[0]);
            indegree[preq[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        // Enqueue all courses with 0 indegree (they have no prerequisites)
        for(int i=0; i<numCourses; i++) {
            if(indegree[i]==0) queue.add(i);
        }
        
        int[] ans = new int[numCourses];
        int ptr = 0;

        while(!queue.isEmpty()) {
            int popped = queue.remove();
            ans[ptr++] = popped;
            if(adjList[popped]==null) continue;
            for(var node: adjList[popped]) {
                // Destory the connection (reduce indegree by 1)
                if(--indegree[(Integer)node]==0) queue.add((Integer)node);
            }
        }

        if(numCourses == ptr)
            return ans;
        else return new int[]{};
    }
}
