package Task_118;

// 118. Pascal's Triangle

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));

        for(int i = 1; i < numRows; i++)
            result.add(calculate(result.get(i-1)));

        return result;

    }

    //формируем строку треугольника, на основе предыдущей строки
    public static List<Integer> calculate(List<Integer> initial) {

        if (initial.size() == 1)
            return List.of(1, 1);

        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 0; i < initial.size() - 1; i++) {
            result.add(initial.get(i) + initial.get(i + 1));
        }
        result.add(1);
        return result;
    }
}
