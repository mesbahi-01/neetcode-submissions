class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;

        int leftPointer = 0;
        int rightPointer = heights.length - 1;

        while (leftPointer < rightPointer) {
            int calculatedArea = (rightPointer - leftPointer) * Math.min(heights[leftPointer], heights[rightPointer]);

            maxArea = Math.max(maxArea, calculatedArea);

            if (heights[leftPointer] > heights[rightPointer]) {
                rightPointer--;
            }else{
                leftPointer++;
            }
        }

        return maxArea;
    }
}
