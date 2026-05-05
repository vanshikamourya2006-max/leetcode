class Solution {
    public boolean canAliceWin(int[] nums) {
        int single_sum=0;
        int double_sum=0;
        int total_sum=0;
        for(int i=0;i<nums.length;i++){
            total_sum+=nums[i];
            if(nums[i]<10){
                single_sum+=nums[i];
            }
            else{
                double_sum+=nums[i];
            }
            
        }
        if(single_sum > total_sum - single_sum || double_sum > total_sum - double_sum){
         return true;
        }
         return false;
    }
}