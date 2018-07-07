package chap02;

import java.util.Scanner;

public class SumOf {
    
    static int sumOf(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
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
    
            System.out.println("합계 : " + sumOf(array));
            
        }
    }
    
}
