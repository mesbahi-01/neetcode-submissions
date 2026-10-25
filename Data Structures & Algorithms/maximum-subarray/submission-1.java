class Solution {
    public int maxSubArray(int[] nums) {
        int maximumSum = nums[0];
        int currentSum = 0;
        for(int i = 0; i< nums.length; i++){
            currentSum = currentSum+ nums[i];
            maximumSum = Math.max(currentSum, maximumSum);
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maximumSum;
    }
}
