package array;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers1 = new int[10];
        int[] numbers2 = new int[] {0, 1, 2};
        int[] numbers3 = {0, 1, 2};

        numbers1[0] = 1;
        numbers1[1] = 3;
        numbers1[2] = 3;
        System.out.println(Arrays.toString(numbers1));

    }
}
