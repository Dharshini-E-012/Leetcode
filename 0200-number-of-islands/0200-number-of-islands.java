class Solution {
    public int numIslands(char[][] grid) {
        int c=0;
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    c++;
                    bfs(grid,i,j);
                }
            }
        }
        return c;
    }
    void bfs(char[][] grid,int i,int j){
        int row=grid.length;
        int col=grid[0].length;
        if(i<0||j<0||i>=row||j>=col||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        bfs(grid,i+1,j);
        bfs(grid,i-1,j);
        bfs(grid,i,j+1);
        bfs(grid,i,j-1);
    }
}