package Task_66;
// Plus One
//

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] digits = new int[]{9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {

        int i = digits.length - 1;
        while (i >= 0) {
            digits[i] = digits[i] + 1;
            if (digits[i] == 10) {
                digits[i] = 0;
                i--;
            } else return digits;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        for (int j = 0; j < digits.length; j++) {
            newDigits[j + 1] = digits[j];
        }
        return newDigits;
    }
}
