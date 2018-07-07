package chap01;

import java.util.Scanner;

public class TriangleLB {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형");
        
        int n = 0;
        
        while (n <= 0) {
            System.out.print("몇 단 삼각형 입니까? : ");
            n = scanner.nextInt();
        }
    
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
}
