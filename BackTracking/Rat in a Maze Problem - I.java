class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        List<String> res = new ArrayList<>();
        int rows = m.length;
        int cols = m[0].length;
        boolean [][]vis=new boolean[n][n];
        if(m[0][0]==1)solve(res, "", m, 0, 0, rows, cols,vis);
        return (ArrayList<String>) res;
    }

    private static void solve(List<String> res, String cur, int[][] m, int r, int c, int rows, int cols,boolean[][]vis) {
        if (r == rows - 1 && c == cols - 1) {
            res.add(cur);
            return;
        }
        vis[r][c]=true;
        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};
        char[] dc = {'L', 'U', 'R', 'D'};
        for (int i = 0; i < 4; i++) {
            int rr = r + dx[i];
            int cc = c + dy[i];
            if (rr >= 0 && rr < rows && cc >= 0 && cc < cols && m[rr][cc] != 0 && vis[rr][cc]==false) {
                solve(res, cur + dc[i], m, rr, cc, rows, cols,vis);
            }
        }
        vis[r][c] = false;
    }
}
