class Solution {
    public int numDecodings(String s) {
        int n = s.length();

        if (s.charAt(0) == '0') {
            return 0;
        }

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            char current = s.charAt(i - 1);
            char previous = s.charAt(i - 2);

            if (current >= '1' && current <= '9') {
                dp[i] += dp[i - 1];
            }

            int number = (previous - '0') * 10 + (current - '0');

            if (number >= 10 && number <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}