class Solution {
    public void moveZeroes(int[] a) {
        
         int j = -1;
         int n=a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) return;
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        
    }
}
