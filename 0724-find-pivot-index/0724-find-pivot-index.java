class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int num:nums)
            sum+=num;
        int sum1=0,sum2=0;
        for(int i=0;i<nums.length;i++){
            sum1=0;
            for(int j=0;j<i;j++){
                sum1+=nums[j];
            }
            sum2=sum-sum1-nums[i];
            if(sum1==sum2)
                return i;
        }
        return -1;
    }
}