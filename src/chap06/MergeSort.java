package chap06;

import java.util.Arrays;

public class MergeSort {
    
    static int[] buff;
    
    static void __mergeSort(int[] array, int left, int right) {
        if(left < right) {
            int center = (left + right) / 2;
            
            __mergeSort(array, left, center);
            __mergeSort(array, center + 1, right);
    
            int i;
            int p = 0;
            for (i = left ; i <= center; i++) {
                buff[p++] = array[i];
            }
            
            int j = 0;
            int k = left;
            while (i <= right && j < p) {
                array[k++] = (buff[j] <= array[i]) ? buff[j++] : array[i++];
            }
            
            while (j < p) {
                array[k++] = buff[j++];
            }
        }
    }
    
    static void mergeSort(int[] array, int n) {
        buff = new int[n];
        
        __mergeSort(array, 0, n - 1);
    
        buff = null;
    }
    
    public static void main(String[] args) {
        int[] array = {22, 5, 11, 32, 120, 68, 70};
        System.out.println(Arrays.toString(array));
        System.out.println("병합 정렬!!");
    
        mergeSort(array, array.length);
    
        System.out.println("오름차순 정렬!!");
        System.out.println(Arrays.toString(array));
    }
    
}
