package chap01;

import java.util.Scanner;

public class Spira {
    
    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            int numOfStar = (i - 1) * 2 + 1;
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= numOfStar; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("몇 단? : ");
        int n = scanner.nextInt();
        spira(n);
    }

}
