import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        // Store banned words
        HashSet<String> bannedSet = new HashSet<>();
        
        for (String word : banned) {
            bannedSet.add(word);
        }
        
        // Convert to lowercase and replace punctuation with spaces
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[!?',;.]", " ");
        
        // Split into words
        String[] words = paragraph.split(" ");
        
        HashMap<String, Integer> count = new HashMap<>();
        
        // Count non-banned words
        for (String word : words) {
            
            if (word.length() == 0) {
                continue;
            }
            
            if (bannedSet.contains(word)) {
                continue;
            }
            
            count.put(
                word,
                count.getOrDefault(word, 0) + 1
            );
        }
        
        // Find most frequent word
        String answer = "";
        int maxCount = 0;
        
        for (String word : count.keySet()) {
            
            if (count.get(word) > maxCount) {
                maxCount = count.get(word);
                answer = word;
            }
        }
        
        return answer;
    }
}