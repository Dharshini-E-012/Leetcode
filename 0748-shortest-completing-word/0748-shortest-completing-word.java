class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        int[] required = new int[26];
        
        // Count letters in licensePlate
        for (char ch : licensePlate.toCharArray()) {
            
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                required[ch - 'a']++;
            }
        }
        
        String answer = "";
        
        // Check every word
        for (String word : words) {
            
            int[] count = new int[26];
            
            for (char ch : word.toCharArray()) {
                count[ch - 'a']++;
            }
            
            boolean valid = true;
            
            // Check all required letters
            for (int i = 0; i < 26; i++) {
                
                if (count[i] < required[i]) {
                    valid = false;
                    break;
                }
            }
            
            // Keep the shortest word
            if (valid) {
                
                if (answer.equals("") || word.length() < answer.length()) {
                    answer = word;
                }
            }
        }
        
        return answer;
    }
}