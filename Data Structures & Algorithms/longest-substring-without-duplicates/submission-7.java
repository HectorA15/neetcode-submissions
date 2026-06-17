class Solution {
    public int lengthOfLongestSubstring(String s) {

        int L = 0;
        char charR;
        char charL;
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        char[] charList = s.toCharArray();

        for (int R = 0; R < charList.length; R++){
            charR = charList[R];
            
            while (charSet.contains(charR)){
                charL = charList[L];
                charSet.remove(charL);
                L++;
            }

            charSet.add(charR);

            maxLength = Math.max(R - L + 1, maxLength);
        }

        return maxLength;
    }
}
