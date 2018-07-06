package chap01;

import java.util.Scanner;

public class GaussSum {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("n : ");
        int n = scanner.nextInt();
    
        int sum = (int) ((1 + n) * (n * 1.0 / 2));
        System.out.println("sum : "+sum);
    }
    
    
}
