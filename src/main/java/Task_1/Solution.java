package Task_1;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] a = new int[]{3, 2, 4};

        System.out.println(Arrays.toString(twoSum(a, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
