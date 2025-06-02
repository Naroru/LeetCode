package Task_88;
// 88. Merge Sorted Array
// way to solution

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0, j = 0;
        while (i < m+n) {

  
            if (nums1[i] > nums2[j]) {
                int number = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = number;
                j++;
            }
            i++;
        }
    }
}
