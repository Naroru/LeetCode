package Task_88;
// 88. Merge Sorted Array
// это указатели, но фишка в том, чтобы начать объединять массив с  конца

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3, n = 3;
        int[] nums2 = new int[]{2, 5, 6};

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int N = n-1;
        int M = m-1;

        while (N >= 0) {
             if (M >= 0 && nums1[M] > nums2[N]) {
                nums1[N + M + 1] = nums1[M];
                M--;
            } else {
                nums1[N + M + 1] = nums2[N];
                N--;
            }
        }
    }
}
