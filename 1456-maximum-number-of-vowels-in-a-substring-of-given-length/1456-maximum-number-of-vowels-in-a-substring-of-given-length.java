class Solution {
    public static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public int maxVowels(String s, int k) {
        int max=0;
        int cur=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i)))
                cur++;
            if(i>=k){
                if(isVowel(s.charAt(i-k)))
                    cur--;
            }
            max=Math.max(max,cur);
        }
        return max;
    }
}