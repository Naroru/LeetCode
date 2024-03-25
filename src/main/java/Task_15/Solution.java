package Task_15;

import java.util.*;

// 15. 3Sum
// sorting + 3 ponters
// фиксируем 1 элемент и таким образом сводим задачу к сумме двух чисел - используем два указателя
// для избегания дублей пропускаем случаи, когда  элементы повторяются
public class Solution {

    public static void main(String[] args) {

        int[] a = new int[]{-1,0,1,2,-1,-4};

        System.out.println(threeSum(a));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        int i;
        int j;

        List<List<Integer>> result = new ArrayList<>();

        for (int fixPointer = 0; fixPointer <= nums.length-3; fixPointer++) {

            //skip duplicates
            if(fixPointer > 0 && nums[fixPointer] == nums[fixPointer -1])
                continue;

            int need = -nums[fixPointer];

            i = fixPointer + 1;
            j = nums.length -1;

            while (i < j) {

                int num_i = nums[i];
                int num_j = nums[j];

                int summ = num_i + num_j;

                if (summ > need)
                    //skip duplicates
                    while (i < j && nums[j] == num_j)
                        j--;

                else if (summ < need)
                        //skip duplicates
                    while (i < j && nums[i] == num_i)
                        i++;

                else {
                    List<Integer> currResult = new ArrayList<>();
                    currResult.add(-need);
                    currResult.add(nums[i]);
                    currResult.add(nums[j]);

                    result.add(currResult);

                    while (i < j && nums[j] == num_j)
                        j--;

                    while (i < j && nums[i] == num_i)
                        i++;
                }
            }
        }


        return result;

    }
}
