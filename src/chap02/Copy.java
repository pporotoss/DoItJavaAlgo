package chap02;

import java.util.Scanner;

public class Copy {
    
    static void copy(int[] a, int[] b) {
        int length = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < length; i++) {
            a[i] = b[i];
        }
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
    
            System.out.print("a배열 크기 : ");
            int numA = scanner.nextInt();
            int[] aArray = new int[numA];
            
            System.out.print("b배열 크기 : ");
            int numB = scanner.nextInt();
        
            int[] bArray = new int[numB];
        
            for (int i = 0; i < numB; i++) {
                System.out.print("bArray[" + i + "] : ");
                bArray[i] = scanner.nextInt();
            }
    
            copy(aArray, bArray);
    
            System.out.println("복사 완료!!");
            System.out.print("aArray : ");
            for (int i = 0; i < aArray.length; i++) {
                System.out.print(aArray[i] + " ");
            }
            System.out.println();
            System.out.print("bArray : ");
            for(int num : bArray) {
                System.out.print(num + " ");
            }
        }
    }
    
}
