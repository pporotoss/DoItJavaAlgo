package chap06;

import java.util.Arrays;

public class MergeArray {

    static void merge(int[] a, int na, int[] b, int nb, int[]c) {
        int pa = 0;
        int pb = 0;
        int pc = 0;
        
        while (pa < na && pb < nb) {
            c[pc++] = (a[pa] <= b[pb]) ? a[pa++] : b[pb++];
        }
    
        while (pa < na) {
            c[pc++] = a[pa++];
        }
        
        while (pb < nb) {
            c[pc++] = b[pb++];
        }
        
    }
    
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 11, 13};
        int[] b = {1, 2, 3, 4, 9, 16, 21};
        int[] c = new int[13];
    
        System.out.println("두 배열의 병합");
        merge(a, a.length, b, b.length, c);
    
        System.out.println("배열 a와 b를 병합하여 배열 c에 저장했습니다.");
        System.out.println("배열 a : ");
        System.out.println(Arrays.toString(a));
        System.out.println();
        System.out.println("배열 b : ");
        System.out.println(Arrays.toString(b));
        System.out.println();
        System.out.println("배열 c : ");
        System.out.println(Arrays.toString(c));
    }

}
