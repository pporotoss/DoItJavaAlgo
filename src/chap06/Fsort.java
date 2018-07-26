package chap06;

import java.util.Arrays;

public class Fsort {
    
    static void fsort(int[] a, int n, int max) {
        int[] f = new int[max + 1];
        int[] b = new int[n];
    
        for (int i = 0; i < n; i++) {
            f[a[i]]++;
        }
    
        for (int i = 1; i <= max; i++) {
            f[i] += f[i - 1];
        }
    
        for (int i = n - 1; i >= 0; i--) {
            b[--f[a[i]]] = a[i];
        }
    
        for (int i = 0; i < n; i++) {
            a[i] = b[i];
        }
    }
    
    
    public static void main(String[] args) {
        int[] x = {22, 5, 11, 32, 120, 68, 70};
        System.out.println("도수 정렬!!");
        System.out.println(Arrays.toString(x));
        
        int max = x[0];
        for (int i = 1; i < x.length; i++) {
            if(x[i] > max) {
                max = x[i];
            }
        }
        
        fsort(x, x.length, max);
        System.out.println("정렬 완료!!");
        System.out.println(Arrays.toString(x));
    }
    
    
}
