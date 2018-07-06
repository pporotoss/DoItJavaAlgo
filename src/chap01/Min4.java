package chap01;

import java.util.Scanner;

public class Min4 {
    
    static int min4 (int a, int b, int c, int d) {
        int min = a;
    
        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;
        
        return min;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a : "); int a = scanner.nextInt();
        System.out.print("b : "); int b = scanner.nextInt();
        System.out.print("c : "); int c = scanner.nextInt();
        System.out.print("d : "); int d = scanner.nextInt();
    
        System.out.println("min : "+min4(a, b, c, d));
    }
    
}
