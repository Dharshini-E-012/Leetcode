class Solution {
    public int majorityElement(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>nums.length/2){
                res=nums[i];
                break;
            }
        }
        return res;
    }
}