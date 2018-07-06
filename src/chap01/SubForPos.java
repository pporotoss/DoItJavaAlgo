package chap01;

import java.util.Scanner;

public class SubForPos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("a : ");
        int a = scanner.nextInt();
        
        int b;
        while (true) {
            System.out.print("b : ");
            b = scanner.nextInt();
            if(a < b) {
                break;
            }
            System.out.println("a보다 큰 값을 입력하세요!");
        }
    
        System.out.println("b - a : " + (b - a) );
        
    }
    
}
