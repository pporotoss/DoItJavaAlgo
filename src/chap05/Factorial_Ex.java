package chap05;

import java.util.Scanner;

public class Factorial_Ex {
    
    static int factorial(int n) {
    
        int result = 1;
    
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("정수를 입력하세요. : ");
            int n = scanner.nextInt();
            int factorial = factorial(n);
            
            System.out.println(n + "의 팩토리얼은 "+factorial+"입니다.");
        }
    }
    
}
