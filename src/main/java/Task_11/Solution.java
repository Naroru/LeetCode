package Task_11;

//11. Container With Most Water
//Two pointer
public class Solution {

    public static void main(String[] args) {

      int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {

        int max_square = 0;
        int i = 0;
        int j = height.length -1;

        while (i < j)
        {
            int rectangleSide = Math.min(height[i], height[j]);
            int curr_square = rectangleSide * (j-i);

            max_square = Math.max(max_square,curr_square);

            if (height[i] > height[j])
                j--;
            else
                i++;
        }
        return max_square;
    }
}

/*
алгоритм мой же, только здесь пропускаются лишние элементы
class Solution {
    public int maxArea(int[] nums) {

        int i = 0, j = nums.length - 1, ans = 0;
        while(i < j){

            int height = Math.min(nums[i], nums[j]);
            ans = Math.max(ans, (j - i) * height);

            while(i < j && nums[i] <= height)
                i++;
            while(i < j && nums[j] <= height)
                j--;
        }
        return ans;
    }
}*/
