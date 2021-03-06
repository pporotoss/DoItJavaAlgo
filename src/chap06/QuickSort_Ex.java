package chap06;

import java.util.Arrays;

public class QuickSort_Ex {
    
    static void swap(int[] array, int idx1, int idx2) {
        int tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
    
    static void quickSort(int[] array, int n) {
        quickSort(array, 0, n - 1);
    }
    
    static void quickSort(int[] array, int left, int right) {
        int pl = left;
        int pr = right;
        int pivot = array[(left + right) / 2];
        
        while (pl <= pr) {
            while (array[pl] < pivot) pl++;
            while (array[pr] > pivot) pr--;
            if(pl <= pr) {
                swap(array, pl++, pr--);
            }
        }
        
        if(left < pr) quickSort(array, left, pr);
        if(pl < right) quickSort(array, pl, right);
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 4, 2, 6, 1, 3, 9, 7};
        System.out.println("퀵 정렬");
    
        quickSort(array, array.length);
        System.out.println("오름차순 정렬 완료!!");
        System.out.println(Arrays.toString(array));
    }
    
}
