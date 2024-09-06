class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        boolean [] visited = new boolean[n];
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(leftChild[i]);
            set.add(rightChild[i]);
        }
        int root = -1;
        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                if(root==-1){
                    root = i;
                } else {
                    return false;
                }
            }
        }
        if(root==-1){
            return false;
        }
        Queue<Integer> queue = new LinkedList<>();
            queue.add(root);
            visited[root] = true;
            while(!queue.isEmpty()){
                int curr = queue.remove();
                if(leftChild[curr]!=-1){
                    if(visited[leftChild[curr]]==true){
                        return false;
                    } else {
                        queue.add(leftChild[curr]);
                        visited[leftChild[curr]]=true;
                    }
                }
                if(rightChild[curr]!=-1){
                    if(visited[rightChild[curr]]==true){
                        return false;
                    } else {
                        queue.add(rightChild[curr]);
                        visited[rightChild[curr]]=true;
                    }
                }
            }
        for(int i=0;i<n;i++){
            if(visited[i]!=true){
                return false;
            }
        }
        return true;
    }
}