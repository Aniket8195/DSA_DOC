

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, List<int[]>> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0, 0)); // node, horizontal distance, level
        
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            TreeNode node = p.node;
            int hd = p.hd;
            int level = p.level;
            
            map.putIfAbsent(hd, new ArrayList<>());
            map.get(hd).add(new int[]{level, node.val});
            
            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1, level + 1));
            }
            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1, level + 1));
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();
        for (List<int[]> list : map.values()) {
            Collections.sort(list, (a, b) -> {
                if (a[0] == b[0]) {
                    return a[1] - b[1]; // sort by value if level is the same
                } else {
                    return a[0] - b[0]; // sort by level
                }
            });
            List<Integer> vertical = new ArrayList<>();
            for (int[] arr : list) {
                vertical.add(arr[1]);
            }
            result.add(vertical);
        }
        
        return result;
    }
    
    class Pair {
        TreeNode node;
        int hd;
        int level;
        Pair(TreeNode n, int h, int l) {
            node = n;
            hd = h;
            level = l;
        }
    }
}
