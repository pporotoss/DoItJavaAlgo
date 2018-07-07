package chap01;

import java.util.Scanner;

public class Npira {
    
    static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            int numOfStar = (i - 1) * 2 + 1;
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= numOfStar; j++) {
                System.out.print(i % 10);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("몇 단? : ");
        int n = scanner.nextInt();
        npira(n);
    }
    
}
