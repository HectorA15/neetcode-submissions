class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> n = new HashSet<>();
        int maxSequence = 0;
        
        for(int i = 0; i < nums.length; i ++){
            n.add(nums[i]);
        }
        
        for(int i = 0; i < nums.length; i ++){
            if(!n.contains(nums[i] - 1)) {
                int length = 0;
                
                while(n.contains(nums[i] + length)){
                    length++;
                }
                maxSequence = Math.max(length, maxSequence);
            }
        }

        return maxSequence;
    }
}
