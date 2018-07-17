package chap05;

import java.util.Arrays;

public class ShakerSort {

    static void shakerSort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        int last = right;
        
        while (left < right) {
    
            for (int i = right; i > left; i--) {
                if(array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                    last = i;
                }
            }
            left = last;
    
            for (int i = left; i < right; i++) {
                if(array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    last = i;
                }
            }
            right = last;
        }
    }
    
    private static void swap(int[] array, int idx1, int idx2) {
        int tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{9, 1, 3, 4, 6, 7, 8};
        System.out.println("셰이커 정렬!!");
        shakerSort(array);
        System.out.println(Arrays.toString(array));
    }
    
    
}
