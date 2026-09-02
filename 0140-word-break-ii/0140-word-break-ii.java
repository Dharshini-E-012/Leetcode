import java.util.*;

class Solution {
    
    Map<Integer, List<String>> memo = new HashMap<>();
    
    public List<String> wordBreak(String s, List<String> wordDict) {
        
        Set<String> dict = new HashSet<>(wordDict);
        
        return backtrack(s, 0, dict);
    }
    
    private List<String> backtrack(
        String s,
        int start,
        Set<String> dict
    ) {
        if (start == s.length()) {
            List<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        if (memo.containsKey(start)) {
            return memo.get(start);
        }
        
        List<String> result = new ArrayList<>();
        for (int end = start + 1; end <= s.length(); end++) {
            
            String word = s.substring(start, end);
        
            if (dict.contains(word)) {
                
                List<String> remaining =
                    backtrack(s, end, dict);
                
                for (String sentence : remaining) {
                    
                    if (sentence.isEmpty()) {
                        result.add(word);
                    } 
                    else {
                        result.add(word + " " + sentence);
                    }
                }
            }
        }
        
        memo.put(start, result);
        
        return result;
    }
}