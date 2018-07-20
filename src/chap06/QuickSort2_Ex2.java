package chap06;

import java.util.Arrays;
import java.util.Stack;

public class QuickSort2_Ex2 {
    
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
        printStack(lstack, rstack, left, right);
        
        while (lstack.isEmpty() == false) {
            left = lstack.pop();
            right = rstack.pop();
            System.out.printf("스택에서 분할하는 문제를 꺼냈습니다.array[%d]~array[%d]를 분할합니다.\n", left, right);
    
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
            if (pr - left <= right - pl) {
                int ltemp;
                ltemp = left;
                left = pl;
                pl = ltemp;
                
                int rtemp = right;
                right = pr;
                pr = rtemp;
            }
            
            if(left < pr) {
                lstack.push(left);
                rstack.push(pr);
                printStack(lstack, rstack, left, pr);
            }
            if(pl < right) {
                lstack.push(pl);
                rstack.push(right);
                printStack(lstack, rstack, pl, right);
            }
        }
    }
    
    private static void printStack(Stack<Integer> lstack, Stack<Integer> rstack, int left, int right) {
        System.out.printf("array[%d]~array[%d]를 분할하는 문제를 스택에 푸시합니다.\n", left, right);
        System.out.print("lstack : ");
        System.out.println(lstack);
        System.out.print("rstack : ");
        System.out.println(rstack);
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 4, 2, 6, 1, 3, 9, 7};
        System.out.println("퀵 정렬");
        
        quickSort(array, 0, array.length - 1);
        System.out.println("오름차순 정렬 완료!!");
        System.out.println(Arrays.toString(array));
    }
    
}
