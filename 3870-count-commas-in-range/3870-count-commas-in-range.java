class Solution {
    public int countCommas(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += String.valueOf(i).length() / 4;
        }
        return count;
    }
}