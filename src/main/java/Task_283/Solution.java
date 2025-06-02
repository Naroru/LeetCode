package Task_283;
// 283. Move Zeroes
// two pointers

public class Solution {

    public static void main(String[] args) {

    }

    public void moveZeroes(int[] nums) {
        int i =  nums.length - 1;;
        int j = nums.length - 1;

        while (i > 0) {
            if(nums[i]==0)
                i++;

        }

    }

}
