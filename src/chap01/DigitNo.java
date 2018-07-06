package chap01;

import java.util.Scanner;

public class DigitNo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 0;
        
        while (n <= 0) {
            System.out.print("n : ");
            n = scanner.nextInt();
        }
        
        int no = 0;
        while (n > 0) {
            n /= 10;
            no++;
        }
        
        System.out.println("digitNo : " + no);
    }
    
    
}
