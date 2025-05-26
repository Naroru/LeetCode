package Task_26;
// Remove Duplicates from Sorted Array
// Используем два указателя. Первый идет по всем элементам - второй по уникальным


public class Solution {

    public static void main(String[] args) {
     int[] mass = new int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(mass));
    }

    public static  int removeDuplicates(int[] nums) {

        int i = 0;
        int j = 0;

        while (i < nums.length) {
            if (nums[i] == nums[j]) {
                i++;
            } else{
                j++;
                nums[j] = nums[i];
                i++;
            }
        }
        return ++j;
    }
}
