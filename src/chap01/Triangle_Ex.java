package chap01;

import java.util.Scanner;

public class Triangle_Ex {
    
    static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void triangleLU(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void triangleRU(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            int last = n - i;
            for (int j = 1; j <= n; j++) {
                if(j <= last) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            
            int n = 0;
            while (n <= 0) {
                System.out.print("몇 단? : ");
                n = scanner.nextInt();
            }
            
            triangleLB(n);
            triangleLU(n);
            triangleRU(n);
            triangleRB(n);
        }
    }
    
}
