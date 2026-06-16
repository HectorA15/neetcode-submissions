class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> firstWord = new HashMap<>();
        Map<Character, Integer> secondWord = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            firstWord.merge(s.charAt(i),1, Integer::sum);
        }

        for(int i = 0; i < t.length(); i++){
            secondWord.merge(t.charAt(i), 1, Integer::sum);
        }

        if(firstWord.equals(secondWord)) return true;
        else return false;

    }
}
