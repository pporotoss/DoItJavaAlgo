package chap06;

import java.util.Arrays;

public class ShellSort2 {
    
    static void shellSort(int[] array, int n) {
        int sortCount = 0;
        int h = 1;
        for ( ; h < n / 9; h = h * 3 + 1);
        
        for ( ; h > 0; h /= 3) {
            for (int i = h; i < n; i++) {
                int tmp = array[i];
                
                int j = i - h;
                for (; j >= 0 && array[j] > tmp; j -= h) {
                    array[j + h] = array[j];
                    sortCount++;
                }
                array[j + h] = tmp;
                sortCount++;
            }
        }
        System.out.println("sortCount : "+sortCount);
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{22, 5, 11, 32, 120, 68, 70};
        System.out.println("셸 정렬(버전 2)");
        
        shellSort(array, array.length);
    
        System.out.println("정렬 완료!!");
        System.out.println(Arrays.toString(array));
    }
    
}
