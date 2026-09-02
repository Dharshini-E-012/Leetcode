class Solution {
    public int projectionArea(int[][] grid) {
        
        int n = grid.length;
        
        int top = 0;
        int front = 0;
        int side = 0;
        
        for (int i = 0; i < n; i++) {
            
            int rowMax = 0;
            
            for (int j = 0; j < n; j++) {
                
                // Top projection
                if (grid[i][j] > 0) {
                    top++;
                }
                
                // Maximum height in this row
                rowMax = Math.max(rowMax, grid[i][j]);
            }
            
            front += rowMax;
        }
        
        // Maximum height in each column
        for (int j = 0; j < n; j++) {
            
            int columnMax = 0;
            
            for (int i = 0; i < n; i++) {
                columnMax = Math.max(columnMax, grid[i][j]);
            }
            
            side += columnMax;
        }
        
        return top + front + side;
    }
}