package chap06;

import java.util.Arrays;

public class QuickSort1_Ex2 {
    
    static void swap(int[] array, int idx1, int idx2) {
        int tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
    
    static void quickSort(int[] array, int left, int right) {
        int pl = left;
        int pr = right;
        int pivot = getPivot(array[left], array[(left + right) / 2], array[right]);
    
        System.out.printf("array[%d]~array[%d] : {", left, right);
        for (int i = left; i < right; i++) {
            System.out.printf("%d , ", array[i]);
        }
        System.out.printf("%d}\n", array[right]);
        
        while (pl <= pr) {
            while (array[pl] < pivot) pl++;
            while (array[pr] > pivot) pr--;
            if(pl <= pr) {
                swap(array, pl++, pr--);
            }
        }
        
        if(pr - left <= pr - right) {
            if(pl < right) quickSort(array, pl, right);
            if(left < pr) quickSort(array, left, pr);
        }
        else {
            if(left < pr) quickSort(array, left, pr);
            if(pl < right) quickSort(array, pl, right);
        }
    }
    
    private static int getPivot(int first, int mid, int last) {
        if(first >= mid) {
            if(mid >= last) {
                return mid;
            }
            else if(first <= last) {
                return first;
            }
            else {
                return last;
            }
        }
        else if (first > last) {
            return first;
        }
        else if (mid > last) {
            return last;
        }
        else {
            return mid;
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 4, 2, 6, 1, 3, 9, 7};
        System.out.println("퀵 정렬");
        
        quickSort(array, 0, array.length - 1);
        System.out.println("오름차순 정렬 완료!!");
        System.out.println(Arrays.toString(array));
    }
    
}
