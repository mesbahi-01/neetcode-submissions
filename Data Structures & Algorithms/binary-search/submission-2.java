class Solution {
    public int search(int[] nums, int target) {
        // the arrary is sorted so 
        // we compare target with the middle of the array
        // while edge != 0
        // if target == nums[edge] 
            // return edge
        // else if target > nums[edge]
            // edge = (edge - 0 )/ 2
        // else
            // edge = (nums.length - edge ) / 2
        int prev = -1;
        int start = 0;
        int end = nums.length -1;
        int currentIndex = (end - start) /2;

        while( start <= end ){
            if(target > nums[currentIndex]){
                start = currentIndex + 1;
            }else if(target < nums[currentIndex]){
                end = currentIndex - 1;
            }else{
                return currentIndex;
            }
            currentIndex = (end - start) /2 + start;
        }
        return -1;

    }
}
