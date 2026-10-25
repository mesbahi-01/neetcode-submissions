public class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (isAlphanumiric(s.charAt(i)) && isAlphanumiric(s.charAt(j))){
                if (toLowercase(s.charAt(i)) == toLowercase(s.charAt(j))) {
                    i++;
                    j--;
                }else{
                    return false;
                }
            }else{
                
                if (!isAlphanumiric(s.charAt(i))) {
                    i++;
                }

                if (!isAlphanumiric(s.charAt(j))) {
                    j--;
                }
            }
        }

        return true;
    }

    private boolean isAlphanumiric(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c <='9' && c >= '0';
    }
    private char toLowercase(char c) {
        if (c <= 'Z' && c >= 'A') {
            return (char) ('a' + (c - 'A'));
        }else return c;
    }
}
