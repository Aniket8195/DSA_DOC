class Solution {
    public int furthestBuilding(int[] height, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
        int i = 0;
        while (i < height.length - 1) {
            int jump = height[i + 1] - height[i];
            
            if (jump > 0) {
                if (bricks >= jump) {
                    pq.add(jump);
                    bricks -= jump;
                } else if (ladders > 0) {
                    if (!pq.isEmpty() && pq.peek() > jump) {
                        bricks += pq.poll() - jump;
                        pq.add(jump);
                    }
                    ladders--;
                } else {
                    break;
                }
            }
            
            i++;
        }
        
        return i;
    }
}
