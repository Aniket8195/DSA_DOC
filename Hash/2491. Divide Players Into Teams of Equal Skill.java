class Solution {
    public long dividePlayers(int[] skill) {
        long totalSum = 0;
        for (int x : skill) totalSum += x;
        
        if ((totalSum * 2) % skill.length != 0) return -1;
        
        long targetSum = totalSum * 2 / skill.length; 
        
        Map<Integer, Integer> skillCount = new HashMap<>();
        for (int x : skill) {
            skillCount.put(x, skillCount.getOrDefault(x, 0) + 1);
        }

        long chemistry = 0;
        for (int key : skillCount.keySet()) {
            while (skillCount.get(key) > 0) {
                int complement = (int)(targetSum - key);
                
                if (!skillCount.containsKey(complement) || skillCount.get(complement) <= 0) {
                    return -1;
                }

                chemistry += key * complement;

                skillCount.put(key, skillCount.get(key) - 1);
                skillCount.put(complement, skillCount.get(complement) - 1);
            }
        }

        return chemistry;
    }
}
