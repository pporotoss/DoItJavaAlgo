package chap05;

import java.util.Scanner;

public class EuclidGCD {
    
    static int gcd(int x, int y) {
        if(y == 0) {
            return x;
        }
    
        return gcd(y, x % y);
    }
    
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("두 정수의 최대공약수를 구합니다.");
    
            System.out.print("정수 1을 입력하세요. : ");
            int x = scanner.nextInt();
            System.out.print("정수 2을 입력하세요. : ");
            int y = scanner.nextInt();
    
            int gcd = gcd(x, y);
            System.out.println("최대공약수는 " + gcd + "입니다.");
        }
    }
    
}
