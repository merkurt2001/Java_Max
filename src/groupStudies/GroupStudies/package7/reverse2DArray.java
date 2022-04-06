package groupStudies.GroupStudies.package7;

import java.util.Arrays;

public class reverse2DArray {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4}, {4, 5, 6, 8}, {7, 8, 9, 2, 4, 5}, {10, 11, 12}};
        int[][] reverse = new int[array.length][];

        for (int i = 0; i < array.length; i++) {
            reverse[i] = new int[array[array.length - i - 1].length];
            for (int j = 0; j < array[array.length - i - 1].length; j++) {
                reverse[i][j] = array[array.length - 1 - i][array[array.length - 1 - i].length - (j + 1)];
            }
        }

        System.out.println(Arrays.deepToString(reverse));
    }

}

