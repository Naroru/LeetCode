package Task_27;
// Remove Element from array
// Используем два указателя. Первый бежит по всем элементам массива, второй только по тем, которые не равны
//заданному числу

public class Solution {

    public static void main(String[] args) {
        int[]nums = new int[]{3,2,2,3};
        int val = 3;

        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;

        while(i < nums.length) {
            if(nums[i]==val)
                i++;
            else {
                nums[j] = nums[i];
                i++;
                j++;
            }
        }
        return j;
    }
}
