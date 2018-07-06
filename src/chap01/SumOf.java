package chap01;

import java.util.Scanner;

public class SumOf {
    
    static int sumOf(int a, int b) {
        int sum = 0;
        
        int min = a;
        int max = b;
        if(min > max) {
            int tmp = min;
            min = max;
            max = tmp;
        }
    
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("b : ");
        int b = scanner.nextInt();
    
        System.out.println("sumOf : "+sumOf(a, b));
    }
    
}
