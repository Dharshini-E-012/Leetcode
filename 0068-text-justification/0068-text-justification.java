import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {    
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < words.length) {
            
            int j = i;
            int wordLength = 0;
            while (j < words.length) {
                
                if (wordLength + words[j].length() + (j - i) > maxWidth) {
                    break;
                }
                
                wordLength += words[j].length();
                j++;
            }
            
            int wordCount = j - i;
            if (j == words.length || wordCount == 1) {
                
                StringBuilder line = new StringBuilder();
                
                for (int k = i; k < j; k++) {
                    
                    line.append(words[k]);
                    
                    if (k < j - 1) {
                        line.append(" ");
                    }
                }
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
                
                result.add(line.toString());
            }
            else {
                
                int gaps = wordCount - 1;
                int totalSpaces = maxWidth - wordLength;
                int spacesPerGap = totalSpaces / gaps;
                int extraSpaces = totalSpaces % gaps;
                
                StringBuilder line = new StringBuilder();
                
                for (int k = i; k < j; k++) {
                    
                    line.append(words[k]);
                    
                    if (k < j - 1) {
                        for (int x = 0; x < spacesPerGap; x++) {
                            line.append(" ");
                        }
                        if (extraSpaces > 0) {
                            line.append(" ");
                            extraSpaces--;
                        }
                    }
                }
                
                result.add(line.toString());
            }
            
            i = j;
        }
        
        return result;
    }
}