class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] visited=new int[graph.length];
        for(int i=0;i<visited.length;i++){
            visited[i]=-1;
        }
        for(int i=0;i<visited.length;i++){
            if(visited[i]==-1){
                if(!bfs(visited,i,graph)){
                    return false;

                }
            }
        }

        return true;
    }
    public boolean bfs(int[] visited,int start,int[][] graph){
        Queue<Integer> q=new LinkedList<>();
        visited[start]=0;
        q.add(start);
        while(!q.isEmpty()){
            int node =q.poll();
            for(int help : graph[node] ){
                if(visited[help]==-1){
                    if(visited[node]==1){
                        visited[help]=0;
                    }
                    else{
                        visited[help]=1;
                    }
                    q.add(help);
                }
                else if(visited[help]==visited[node]){
                    return false;
                }
            }
        }
        return true;
    }
}
