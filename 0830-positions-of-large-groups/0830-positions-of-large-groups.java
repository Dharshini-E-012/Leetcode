import java.util.*;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        int start = 0;
        
        for (int i = 1; i <= s.length(); i++) {
            
            // Group ends when character changes
            // or when we reach the end of the string
            if (i == s.length() || s.charAt(i) != s.charAt(i - 1)) {
                
                int length = i - start;
                
                // Check if group is large
                if (length >= 3) {
                    result.add(Arrays.asList(start, i - 1));
                }
                
                // Start a new group
                start = i;
            }
        }
        
        return result;
    }
}