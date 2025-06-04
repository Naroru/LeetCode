package Task_344;
// 344. Reverse String
// two pointers

public class Solution {

    public static void main(String[] args) {
        char[] mass = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(mass);
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char temp;
        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}

