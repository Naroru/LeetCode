package Task_35;
//  Search Insert Position
//  Т.к. массив отсортирован, то используется бинарный поиск

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[] {1,3,5,6};
        int target = 2;

        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] == target)
                return mid;

            if(target > nums[mid])
                left = mid +1;
            else
                right = mid - 1;
        }

        return left; //елсли нет нужного элемента, возвращаем индекс, где он должен был бы находится
    }
}
