class Solution {
    public int maxSubArray(int[] nums) {
        int maximumSum = nums[0];
        int currentSum = nums[0];  // ← start at nums[0], not 0
        
        for(int i = 1; i < nums.length; i++){  // ← start loop at 1
            currentSum = Math.max(nums[i], currentSum + nums[i]);  // ← modified version
            maximumSum = Math.max(currentSum, maximumSum);
        }
        return maximumSum;
    }
}