import java.util.*;
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;
        Map<String, Integer> needed = new HashMap<>();
        for (String word : words) {
            needed.put(word, needed.getOrDefault(word, 0) + 1);
        }
        for (int start = 0; start < wordLen; start++) {
            int left = start;
            int count = 0;
            Map<String, Integer> seen = new HashMap<>();
            for (int right = start; right + wordLen <= s.length(); right += wordLen) {
                String word = s.substring(right, right + wordLen);
                if (!needed.containsKey(word)) {
                    seen.clear();
                    count = 0;
                    left = right + wordLen;
                    continue;
                }
                seen.put(word, seen.getOrDefault(word, 0) + 1);
                count++;
                while (seen.get(word) > needed.get(word)) {
                    String leftWord = s.substring(left, left + wordLen);
                    seen.put(leftWord, seen.get(leftWord) - 1);
                    left += wordLen;
                    count--;
                }
                if (count == wordCount) {
                    result.add(left);
                    String leftWord = s.substring(left, left + wordLen);
                    seen.put(leftWord, seen.get(leftWord) - 1);
                    left += wordLen;
                    count--;
                }
            }
        } 
        return result;
    }
}