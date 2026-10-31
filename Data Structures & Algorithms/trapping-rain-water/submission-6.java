class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        if (right < 2) {
            return 0;
        }


        int result = 0;

        int maxLeftBarier = height[0];
        int maxRightBarier = height[right];

        while (left < right) {
            if (maxLeftBarier <= maxRightBarier) {
                left++;
                int trappedWater = maxLeftBarier - height[left];
                result += Math.max(0, trappedWater);
                maxLeftBarier = Math.max(height[left], maxLeftBarier);

            }else{
                right--;
                int trappedWater = maxRightBarier - height[right];
                result+= Math.max(0, trappedWater);
                maxRightBarier = Math.max(height[right], maxRightBarier);
            }
        }

        return result;
    }
}
