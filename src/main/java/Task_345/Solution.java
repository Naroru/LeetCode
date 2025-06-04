package Task_345;
// 345. Reverse Vowels of a String
// Two Pointers

public class Solution {
    public static void main(String[] args) {

        System.out.println(reverseVowels("ai"));
    }

    public static String reverseVowels(String s) {

        int left = 0;
        int right = s.length() - 1;
        char[] mass = s.toCharArray();

        while (true) {

            while (!isVowel(mass[left]) && left < right) {
                left++;
            }
            while (!isVowel(mass[right]) && right > left) {
                right--;
            }

            if (left >= right)
                return String.valueOf(mass);

            char temp = mass[left];
            mass[left] = mass[right];
            mass[right] = temp;
            left++;
            right--;
        }
    }


    private static boolean isVowel(char symbol) {
        char lowercase = Character.toLowerCase(symbol);
        return lowercase == 'a' || lowercase == 'e' || lowercase == 'i' || lowercase == 'o' || lowercase == 'u';

        //альтернатива
        // String vowels = "aeiouAEIOU";
        // vowels.indexOf(mass[i]) == -1
    }

}
