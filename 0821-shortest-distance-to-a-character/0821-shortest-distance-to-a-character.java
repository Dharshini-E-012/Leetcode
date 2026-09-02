class Solution {
    public int[] shortestToChar(String s, char c) {
        
        int n = s.length();
        int[] answer = new int[n];
        
        // Initially use a large value
        int distance = n;
        
        // Left to Right
        for (int i = 0; i < n; i++) {
            
            if (s.charAt(i) == c) {
                distance = 0;
            } 
            else {
                distance++;
            }
            
            answer[i] = distance;
        }
        
        // Right to Left
        distance = n;
        
        for (int i = n - 1; i >= 0; i--) {
            
            if (s.charAt(i) == c) {
                distance = 0;
            } 
            else {
                distance++;
            }
            
            answer[i] = Math.min(answer[i], distance);
        }
        
        return answer;
    }
}