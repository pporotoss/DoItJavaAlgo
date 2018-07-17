package chap05;

import java.util.Arrays;

public class InsertionSort_Ex {
    
    static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 2; i < n; i++) {
            int tmp = array[i];
            array[0] = tmp;
            int j = i;
            for (; array[j - 1] > tmp; j--) {
                array[j] = array[j - 1];
            }
            
            if(j > 0) {
                array[j] = tmp;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{0, 22, 5, 11, 32, 120, 68, 70};
        System.out.println("단순 삽입 정렬");
        System.out.println("정렬 전 : ");
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println("정렬 후 : ");
        System.out.println(Arrays.toString(array));
    }
    
}
