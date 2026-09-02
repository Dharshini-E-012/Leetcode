class Solution {
    public String toGoatLatin(String sentence) {
        
        String[] words = sentence.split(" ");
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            
            String word = words[i];
            
            // Check first character
            char first = word.charAt(0);
            
            if (!isVowel(first)) {
                // Move first letter to the end
                word = word.substring(1) + first;
            }
            
            // Add "ma"
            word = word + "ma";
            
            // Add 'a' according to word index
            for (int j = 0; j <= i; j++) {
                word = word + "a";
            }
            
            // Add space between words
            if (i > 0) {
                result.append(" ");
            }
            
            result.append(word);
        }
        
        return result.toString();
    }
    
    private boolean isVowel(char ch) {
        
        ch = Character.toLowerCase(ch);
        
        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}