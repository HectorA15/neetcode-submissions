class Solution {
    public int trap(int[] height) {
        
        int i = 0;
        int j = height.length - 1;

        int left = height[i];
        int right  = height[j];
        int maxL = 0;
        int maxR = 0;
        int water = 0;


        while(i < j){
            left = height[i];
            right = height[j];
            
            maxL = Math.max(maxL, left);
            maxR = Math.max(maxR, right);

            if (left < right){
                water += maxL - height[i];
                i++;
            }
            else if (left > right){
                water += maxR - height[j];
                j--;
            }
            else{
                i++;           
            }
        }
        return water;

    }
}
