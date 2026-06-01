class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int max = 0;
        int p2 = 0;
        int p1 = 0; 
        for (int i = 0; i < nums.length; i++) {
            int count = Math.max(p1, p2 + nums[i]);
            p2 = p1;
            p1 = count;
            if (count > max) max = count;
        }
        return max;
    }
}
