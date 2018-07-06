package chap01;

import java.util.Scanner;

public class Min3 {
    
    static int min3(int a, int b, int c) {
        int min = a;
        
        if(b < min) min = b;
        if(c < min) min = c;
        
        return min;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a 의 값 : "); int a = scanner.nextInt();
        System.out.print("b 의 값 : "); int b = scanner.nextInt();
        System.out.print("c 의 값 : "); int c = scanner.nextInt();
    
        System.out.println("min :  "+ min3(a, b, c));
    }
    
}
