package chap06;

import java.util.Arrays;

public class HeapSort {
    
    static void swap(int[] array, int idx1, int idx2) {
        int tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
    
    static void downHeap(int[] array, int left, int right) {
        int temp = array[left];
        int child;
        int parent;
    
        for (parent = left; parent < (right + 1) / 2; parent = child) {
            int cl = parent * 2 + 1;
            int cr = cl + 1;
    
            child = (cr <= right && array[cr] > array[cl]) ? cr : cl;
            if(temp >= array[child]) {
                break;
            }
            array[parent] = array[child];
        }
        array[parent] = temp;
    }
    
    static void heapSort(int[] array, int n) {
        for (int i = (n - 1) / 2; i >= 0; i--) {
            downHeap(array, i, n - 1);
        }
    
        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i);
            downHeap(array, 0, i - 1);
        }
    }
    
    public static void main(String[] args) {
        int[] array = {22, 5, 11, 32, 120, 68, 70};
        System.out.println("힙 정렬!!!");
        System.out.println(Arrays.toString(array));
        System.out.println();
        heapSort(array, array.length);
        System.out.println("정렬 완료1!");
        System.out.println(Arrays.toString(array));
    }
    
}
