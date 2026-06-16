class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> sums = new HashMap<>();
        Map<Integer, List<Integer>> freq = new HashMap<>();


        for (int n : nums){
            sums.merge(n, 1, Integer::sum);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for(Map.Entry<Integer,Integer> entry : sums.entrySet()){
            int frequency = entry.getValue();
            if(buckets[frequency] == null) buckets[frequency] = new ArrayList<>();
            
            buckets[frequency].add(entry.getKey());
            
        }
        
        int[] result = new int[k];
        int count = 0;
        
        for (int i = buckets.length - 1; i >=  0; i--) {
            if(buckets[i] != null){
                for(int number : buckets[i]){
                    result[count++] = number;
                    if (count == k){
                        return result;
                    }
                }
            }
            
        }

 
        return result;
    }
}
