package Task_283;
// 283. Move Zeroes
// two pointers
//есть второе, более простое решение
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] mass = new int[]{1, 0, 0, 3, 2, 0, 1};
        int[] mass2 = new int[]{1, 0, 1};
        moveZeroes(mass2);
        System.out.println(Arrays.toString(mass2));
    }


    public static void moveZeroes(int[] nums) {

        //мое кривое решение. Используем два указателя
        //зероПоинтер ищет нули. Другой числа
        // когда они оба нашли своё значение - меняем местами. При этом учитываем, что numberPointer  должен быть впереди ЗероПоинтера, чтобы обмен был в нужную сторону
        int zeroPointer = 0;
        int numberPointer = 0;

        while (true) {

            while (zeroPointer < nums.length  && nums[zeroPointer] != 0)
                zeroPointer++;

            if (zeroPointer == nums.length)
                break;

            while (numberPointer < nums.length && (nums[numberPointer] == 0 || numberPointer <= zeroPointer))
                numberPointer++;

            if (numberPointer == nums.length)
                break;

            nums[zeroPointer] = nums[numberPointer];
            nums[numberPointer] = 0;
        }
    }

    public void moveZeroesSecond(int[] nums) {
        //здесь тупо перемещаем цифры вперед. А потом заполняем нулями. Кулл
        int insertPos = 0;

        // Step 1: Move all non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Step 2: Fill the rest with zeros
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void moveZeroesThird(int[] nums) {

//здесь также с двумя указателями свитчим позиции нулей и числе
//но тут не ищутся нули специально. Два указателя могут указывать на одно и то же число  - в этом случае оно свичнется
//по итогу левый указатель рано или поздно попадет на 0, а правый пройдет дальше. И свитчи будут корректные

        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}

