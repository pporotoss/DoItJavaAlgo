package chap02;

import java.util.Scanner;

public class ReverseArray {
    
    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
    
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - 1 - i);
        }
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
            for (int i = 0; i < num; i++) {
                System.out.println("array[" + i + "] = " + array[i]);
            }
        }
        
    }
    
}
