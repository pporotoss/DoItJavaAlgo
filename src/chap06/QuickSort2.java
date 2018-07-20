package chap06;

import java.util.Arrays;
import java.util.Stack;

public class QuickSort2 {
    
    static void swap(int[] array, int idx1, int idx2) {
        int tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
    
    static void quickSort(int[] array, int left, int right) {
        Stack<Integer> lstack = new Stack<>();
        Stack<Integer> rstack = new Stack<>();
    
        lstack.push(left);
        rstack.push(right);
        
        while (lstack.isEmpty() == false) {
            left = lstack.pop();
            right = rstack.pop();
    
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
            
            if(left < pr) {
                lstack.push(left);
                rstack.push(pr);
            }
            if(pl < right) {
                lstack.push(pl);
                rstack.push(right);
            }
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
