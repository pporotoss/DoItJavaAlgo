package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand_Ex {
    
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
        Random random = new Random();

        System.out.println("키의 최댓값을 구합니다.");
        int num = random.nextInt(15) + 1;
        System.out.println("사람 수 : " + num);

        int[] heights = new int[num];

        System.out.println("키 값은 아래와 같습니다.");

        for (int i = 0; i < num; i++) {
            heights[i] = 100 + random.nextInt(90);
            System.out.println("heights[" + i + "] : "+heights[i]);
        }
    
        System.out.println("최댓값은 " + maxOf(heights) + "입니다.");
    }
    
}
