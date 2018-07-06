package chap01;

import java.util.Scanner;

public class SumForPos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        
        do {
            System.out.print("n : ");
            n = scanner.nextInt();
        } while (n <= 0);
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
    
        System.out.println("sum : "+sum);
    }
    
}
