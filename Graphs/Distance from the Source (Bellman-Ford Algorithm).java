class Solution {
    static int[] bellman_ford(int v, ArrayList<ArrayList<Integer>> edges, int s) {
        
        //create Graph
        HashMap<Integer,ArrayList<ArrayList<Integer>>> map = new HashMap<>();
        for(int i=0;i<v;i++){
            map.put(i,new ArrayList<>());
        }
        ArrayList<Integer> a;
        for(int i=0;i<edges.size();i++){
            a = new ArrayList<>();
            a.add(edges.get(i).get(1));
            a.add(edges.get(i).get(2));
            map.get(edges.get(i).get(0)).add(a);
        }
        
        //Start Implementing Bellman Ford Algorithm
        Queue<Integer> q = new LinkedList<>();
        int pathLength[] = new int[v];
        
        int negArr[] = new int[v];//check all node . if any node coming grater then number of vertices then there is a cycle.
        boolean containNeg = false;
        
        Arrays.fill(pathLength,100000000);
        q.add(s);//add source into queue;
        pathLength[s] = 0;
        
        
        while(!q.isEmpty()){
            int val = q.poll();
            if(val == s){
                negArr[val]++;
            }
            if(negArr[val]>v){//contain cycle
                containNeg = true;
                break;
            }

            ArrayList<ArrayList<Integer>> list = map.get(val);
            for(ArrayList<Integer> it : list){
                if(it.get(1)!=0){
                    if(pathLength[it.get(0)]>pathLength[val]+it.get(1)){
                        pathLength[it.get(0)] = pathLength[val]+it.get(1);
                        if(!q.contains(it.get(0))){
                            q.add(it.get(0));
                            negArr[it.get(0)]++;
                        }
                    }
                }
            }
        }
        
        if(containNeg) {
			return new int[] {-1};//according to GFG question . if negative path then return -1;
		}

        return pathLength;
    }
}
