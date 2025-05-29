package Task_125;
// 125. Valid Palindrome
// 2 pointers

public class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        boolean result = true;

        while (i < j) {

            if (!isAlphabetic(s.charAt(i))) {
                i++;
                continue;
            }
            if (!isAlphabetic(s.charAt(j))) {
                j--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
                i++;
                j--;
            } else {
                result = false;
                return result;
            }
        }
        return result;
    }

    public static boolean isAlphabetic(char s) {
        return Character.isAlphabetic(s) || Character.isDigit(s);

    }
}
