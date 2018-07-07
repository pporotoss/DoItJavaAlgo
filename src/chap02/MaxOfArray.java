package chap02;

import java.util.Scanner;

public class MaxOfArray {
    
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in);){
    
            System.out.println("키의 최댓값을 구합니다.");
            System.out.print("사람 수 : ");
            int num = scanner.nextInt();
    
            int[] heights = new int[num];
    
            for (int i = 0; i < num; i++) {
                System.out.print("heights[" + i + "] : ");
                heights[i] = scanner.nextInt();
            }
    
            System.out.println("최댓값은 " + maxOf(heights) + "입니다.");
            
        }
    }
    
}
