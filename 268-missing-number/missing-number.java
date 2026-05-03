class Solution {
    public int missingNumber(int[] nums) {
        int total_sum=nums.length*(nums.length+1)/2;
        int curr_sum=0;
        for(int i=0;i<nums.length;i++){
                curr_sum=curr_sum+nums[i];
        }
        return total_sum-curr_sum;
    }
}