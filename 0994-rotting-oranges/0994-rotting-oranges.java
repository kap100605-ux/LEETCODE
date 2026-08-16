class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        boolean [][] vis = new boolean [n][m];
        
      Queue<int []>Q= new LinkedList<>();
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==2){
                Q.add (new int []{i,j,0});
                vis[i][j]=true; 
            }

        }
      }
      int ans =0;
       while(Q.size()>0){
        int [] current = Q.poll();
        int i = current [0];
        int j = current[1];
        int time = current[2];
    
        ans=Math.max(ans,time);

         if (i - 1 >= 0 && !vis[i - 1][j] && grid[i - 1][j] == 1) { //top
        Q.add(new int []{i - 1, j, time + 1});
        vis[i - 1][j] = true;
    }
     if (j+1 < m  && !vis[i][j+1] && grid[i][j+1] == 1) { //top
        Q.add(new int []{i, j+1, time + 1});
        vis[i][j+1] = true;
    }

     if (i+1<n && !vis[i+1][j] && grid[i+1][j] == 1) { //top
        Q.add(new int[]{i+1, j, time + 1});
        vis[i+1][j] = true;
    }
     if (j- 1 >= 0 && !vis[i][j-1] && grid[i ][j-1] == 1) { //top
        Q.add(new int[]{i, j-1, time + 1});
        vis[i][j-1] = true;
    }
       }
    for(int i=0;i<n;i++){
        for(int  j=0;j<m;j++){
            if(grid[i][j]==1&& !vis[i][j]){
                return -1;
            }

       }

        
    }
 return ans;   
}
}
