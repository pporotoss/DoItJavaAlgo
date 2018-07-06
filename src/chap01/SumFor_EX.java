package chap01;

import java.util.Scanner;

public class SumFor_EX {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("n : ");
        int n = scanner.nextInt();
        
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (i != n) {
                sb.append(i + " + ");
            }
            else {
                sb.append(i);
            }
        }
    
        System.out.println(sb.toString() + " = "+sum);
        
    }
    
}
