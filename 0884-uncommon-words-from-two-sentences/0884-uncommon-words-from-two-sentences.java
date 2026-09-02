import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        // Count words from first sentence
        for (String word : s1.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        // Count words from second sentence
        for (String word : s2.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        // Store words that appear exactly once
        List<String> result = new ArrayList<>();
        
        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }
}