class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> words = new HashMap<>();
        for(String s: strs){
            int[] count = new int[26];

            for(char c : s.toCharArray()){
                count[c - 'a'] ++;
            }

            String key = Arrays.toString(count);
            words.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(words.values());
    }
}
