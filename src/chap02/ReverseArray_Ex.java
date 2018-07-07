package chap02;

import java.util.Scanner;

public class ReverseArray_Ex {
    
    static void swap(int[] a, int idx1, int idx2) {
        System.out.println("a[" + idx1 + "] 과 a[" + idx2 + "]를 교환합니다.");
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
    
    static void reverse(int[] a) {
        printArray(a);
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - 1 - i);
            printArray(a);
        }
    }
    
    private static void printArray(int[] a) {
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("배열 크기 : ");
            int num = scanner.nextInt();
    
            int[] array = new int[num];
    
            for (int i = 0; i < num; i++) {
                System.out.print("array[" + i + "] : ");
                array[i] = scanner.nextInt();
            }
            
            reverse(array);
    
            System.out.println("요소를 역순으로 정렬했습니다.");
        }
        
    }
    
}
