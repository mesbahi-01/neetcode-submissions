class Solution {
        static public int longestConsecutive(int[] nums) {
        int longestConsecutive = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i + 1] - nums[i] == 1) {
                    counter++;
                    i++;
                } else if (nums[i + 1] == nums[i]) {
                    i++;
                } else {
                    break;
                }
            }
            longestConsecutive = Math.max(counter, longestConsecutive);
        }

        return longestConsecutive;
    }

}
