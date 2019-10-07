package homework5;


import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 4, 5, 6};
        System.out.println("Массив до сортировки " + Arrays.toString(array));
        sort(array);
        System.out.println("Массив после сортировки " + Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
                else {
                    if(i==j-1){
                        break;
                    }
                }
                }
            }
        }
    }

