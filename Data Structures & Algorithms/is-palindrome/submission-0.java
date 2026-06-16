class Solution {
    public  static boolean isPalindrome(String s) {


        StringBuilder sb = new StringBuilder();

       s = s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]", "");
       
       sb.append(s).reverse();
       
       String reversed = sb.toString();
       
       if (s.equals(reversed)) return true;
       else return false;
        
        

    }
}
