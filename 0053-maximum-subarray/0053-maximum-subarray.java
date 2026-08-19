class Solution {
    public int maxSubArray(int[] nums) {
        int sum =nums[0];
        int currSum=nums[0];
        for(int i =1;i<nums.length;i++){
           
           sum= Math.max(nums[i],nums[i]+sum);
           currSum= Math.max(currSum,sum);
           
        }
         return currSum;    
    }
}
    
