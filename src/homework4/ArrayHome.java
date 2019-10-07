package homework4;

import java.util.Arrays;

public class ArrayHome {
    public static void main(String[] args) {
        int[][] array2 = new int[5][2];
        int[][] array1 =
                {
                        {23, 57, 1, 59, 3, 6, 5, 9},
                        {4, 27, 57, 34, 84, 8, 7, 68},
                        {2, 5, 3, 55, 37, 57, 34, 7},
                        {4, 8, 93, 42, 81, 66, 4, 0},
                        {12, 7, 36, 8, 5, 2, 8, 9}
                };
        System.out.println("Начальный массив " + Arrays.deepToString(array1));
        for (int[] arrayOne : array1) {
            Arrays.sort(arrayOne);
        }
        System.out.println("Отсортированный массив " + Arrays.deepToString(array1));
        for (int i = 0; i < 5; i++) {
            array2[i][0] = array1[i][0];
            array2[i][1] = array1[i][7];
        }
        System.out.println("Массив наименьших и наибольших значений " + Arrays.deepToString(array2));
    }
}
