package chap03;

import java.util.Arrays;

public class SearchIdx {
    
    static int searchIdx(int[] array, int n, int key, int[] idx) {
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(array[i] == key) {
                idx[count++] = i;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{1, 9, 2, 9, 4, 6, 7, 9};
        int[] idx = new int[array.length];
        int key = 9;
    
    
        int count = searchIdx(array, array.length, key, idx);
    
        System.out.println("count : "+count);
        System.out.println(Arrays.toString(idx));
    }
    
}
