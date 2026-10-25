
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int a = nums[i];

            // All remaining numbers are positive
            if (a > 0) {
                break;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = a + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    result.add(
                        List.of(a, nums[left], nums[right])
                    );

                    left++;
                    right--;

                    // Skip duplicate second elements
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate third elements
                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
