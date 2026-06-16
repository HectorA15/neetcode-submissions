class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int minH = 0;
        int maxArea = 0;
        int curArea;

        while (left < right){
            minH = Math.min(heights[left],  heights[right]);
            curArea = minH * (right - left);

            if (curArea > maxArea){
                maxArea = curArea; 
            }

            if (heights[left] <  heights[right]) left++;
            else right--;
        }
        return maxArea;
    }
}
