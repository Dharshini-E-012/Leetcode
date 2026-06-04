class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ws=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int we=0;we<nums.length;we++){
            sum+=nums[we];
            while(sum>=target){
                min=Math.min(min,we-ws+1);
                sum=sum-nums[ws];
                ws++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}