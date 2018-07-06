package chap01;

import java.util.Scanner;

public class Median {
    
    static int med3(int a, int b, int c) {
        if(a >= b) {
            if(b >= c) {
                return b;
            }
            else if(a <= c) {
                return a;
            }
            else {
                return c;
            }
        }
        else if(a > c) {
            return a;
        }
        else if(b > c) {
            return c;
        }
        else {
            return b;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("a : "); int a = scanner.nextInt();
        System.out.print("b : "); int b = scanner.nextInt();
        System.out.print("c : "); int c = scanner.nextInt();
    
        System.out.println("median : " + med3(a, b, c));
    }
    
}
