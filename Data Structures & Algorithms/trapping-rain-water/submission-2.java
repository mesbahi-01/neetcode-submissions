class Solution {
    public int trap(int[] height) {

        int result = 0;

        int[] maxHeight = new int[height.length];

        int currentMaxHeight = 0;

        for (int i = 0; i < height.length; i++) {
            maxHeight[i] = currentMaxHeight;
            currentMaxHeight = Math.max(currentMaxHeight, height[i]);
        }

        currentMaxHeight = 0;

        for (int i = height.length - 1; i  > - 1; i--) {
            maxHeight[i] = Math.min(maxHeight[i], currentMaxHeight);
            currentMaxHeight = Math.max(currentMaxHeight, height[i]);
        }

        for (int i = 0; i < maxHeight.length; i++) {
            int trappedWater = maxHeight[i] - height[i];

            if (trappedWater > 0) {
                result+= trappedWater;
            }
        }

        return result;
    }
}
