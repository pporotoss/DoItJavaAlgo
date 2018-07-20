package chap06;

import java.util.Arrays;

public class ArraySortTester {
    
    public static void main(String[] args) {
        int[] array = {22, 5, 11, 32, 120, 68, 70};
    
        System.out.println(Arrays.toString(array));
        System.out.println("정렬 완료");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
