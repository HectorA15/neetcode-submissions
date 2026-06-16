class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = {0,0};

        Map<Integer, Integer> sums = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            
            int difference = target - nums[i];

            if(sums.containsKey(difference)){
                output = new int[]{sums.get(difference), i };                
            }

            sums.put(nums[i], i);
        }
        
        return output;
        
    }
}
