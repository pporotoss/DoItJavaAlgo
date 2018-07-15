package chap05;

import java.util.Scanner;

public class Hanoi {
    
    static void move(int no, int from, int to) {
        
        int mid = 6 - from - to;
        
        if(no > 1) {
            move(no - 1, from, mid);
        }
    
        System.out.println("원반 [" + no + "]을 "+ from +"기둥에서 " + to + "기둥으로 옮김");
        
        if(no > 1) {
            move(no - 1, mid, to);
        }
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
    
            System.out.println("하노이의 탑");
            System.out.print("원반 갯수 : ");
            int n = scanner.nextInt();
            
            move(n, 1, 3);
        }
    }
    
}
