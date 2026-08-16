


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

                        int[] current = q.poll();

                        int row = current[0];
                        int col = current[1];

                        
                        if (row - 1 >= 0 &&
                            !vis[row - 1][col] &&
                            grid[row - 1][col] == '1') {

                            q.add(new int[]{row - 1, col});
                            vis[row - 1][col] = true;
                        }

                        
                        if (col + 1 < m &&
                            !vis[row][col + 1] &&
                            grid[row][col + 1] == '1') {

                            q.add(new int[]{row, col + 1});
                            vis[row][col + 1] = true;
                        }

                        
                        if (row + 1 < n &&
                            !vis[row + 1][col] &&
                            grid[row + 1][col] == '1') {

                            q.add(new int[]{row + 1, col});
                            vis[row + 1][col] = true;
                        }

                        
                        if (col - 1 >= 0 &&
                            !vis[row][col - 1] &&
                            grid[row][col - 1] == '1') {

                            q.add(new int[]{row, col - 1});
                            vis[row][col - 1] = true;
                        }
                    }
                }
            }
        }

        return ans;
    }
}