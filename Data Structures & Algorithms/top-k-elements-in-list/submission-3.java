class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> sums = new HashMap<>();
        Map<Integer, List<Integer>> freq = new HashMap<>();


        for (int n : nums){
            sums.merge(n, 1, Integer::sum);
        }


        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        for(Map.Entry<Integer,Integer> entry : sums.entrySet()){
            heap.offer(new int[]{ entry.getValue(), entry.getKey()});
            
            if(heap.size() > k){
                heap.poll();
            }
            
        }
        
        int[] result = new int[k];
        
        for(int i = 0; i < k ; i++){
            result[i] = heap.poll()[1];
        }
 
        return result;
    }
}
