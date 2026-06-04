class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int ws=0;
        int pro=1;
        int max=0;
        for(int we=0;we<nums.length;we++){
            pro=pro*nums[we];
            while(pro>=k){
                pro=pro/nums[ws];
                ws++;
            }
            max=max+(we-ws+1);
        }
        return max;
    }
}