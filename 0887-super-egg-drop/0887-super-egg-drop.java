class Solution {
    public int superEggDrop(int k, int n) {
        int[] dp=new int[k+1];
        int c=0;
        while(dp[k]<n){
            c++;
            for(int i=k;i>=1;i--){
                dp[i]=dp[i]+dp[i-1]+1;
            }
        }
        return c;
    }
}