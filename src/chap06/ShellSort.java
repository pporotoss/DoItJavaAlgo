package chap06;

import java.util.Arrays;

public class ShellSort {
    
    static void shellSort(int[] array, int n) {
        int sortCount = 0;
        for (int h = n/2; h > 0; h /= 2) {
            for (int i = h; i < n; i++) {
                int j = i - h;
                int tmp = array[i];
                for ( ; j >= 0 && array[j] > tmp; j -= h) {
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
        System.out.println("셸 정렬(버전 1)");
        
        shellSort(array, array.length);
    
        System.out.println("오름차순 정렬!!");
        System.out.println(Arrays.toString(array));
    }
    
}
