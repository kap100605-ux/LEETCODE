

class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '1' && !vis[i][j]) {
                    ans++;
                    q.add(new int[]{i, j});
                    vis[i][j] = true;

                    while (!q.isEmpty()) {
                        int[] cur = q.poll();
                        int r = cur[0];
                        int c = cur[1];

                        if (r - 1 >= 0 && !vis[r - 1][c] && grid[r - 1][c] == '1') {
                            q.add(new int[]{r - 1, c});
                            vis[r - 1][c] = true;
                        }

                        if (c + 1 < m && !vis[r][c + 1] && grid[r][c + 1] == '1') {
                            q.add(new int[]{r, c + 1});
                            vis[r][c + 1] = true;
                        }

                        if (r + 1 < n && !vis[r + 1][c] && grid[r + 1][c] == '1') {
                            q.add(new int[]{r + 1, c});
                            vis[r + 1][c] = true;
                        }

                        if (c - 1 >= 0 && !vis[r][c - 1] && grid[r][c - 1] == '1') {
                            q.add(new int[]{r, c - 1});
                            vis[r][c - 1] = true;
                        }
                    }
                }
            }
        }

        return ans;
    }
}
