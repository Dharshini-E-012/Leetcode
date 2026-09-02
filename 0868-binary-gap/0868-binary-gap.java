class Solution {
    public int binaryGap(int n) {
        
        int position = 0;
        int previous = -1;
        int maxDistance = 0;
        
        while (n > 0) {
            
            // Check if current bit is 1
            if ((n & 1) == 1) {
                
                if (previous != -1) {
                    maxDistance = Math.max(
                        maxDistance,
                        position - previous
                    );
                }
                
                previous = position;
            }
            
            // Move to next bit
            n = n >> 1;
            position++;
        }
        
        return maxDistance;
    }
}