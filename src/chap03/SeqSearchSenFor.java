package chap03;

import java.util.Scanner;

public class SeqSearchSenFor {
    
    static int seqSearch(int[] a, int n, int key) {
    
        a[n] = key;
    
        int i;
        for (i = 0; a[i] != key; i++);
        
        return i == n ? -1 : i;
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("배열 크기 : ");
            int num = scanner.nextInt();
            int[] x = new int[num + 1];
    
            for (int i = 0; i < num; i++) {
                System.out.print("x[" + i + "] : ");
                x[i] = scanner.nextInt();
            }
    
            System.out.print("검색할 값 : ");
            int key = scanner.nextInt();
            int idx = seqSearch(x, num, key);
    
            if(idx == -1) {
                System.out.println("그 값의 요소가 없습니다.");
            }
            else {
                System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
            }
        }
    }
    
}
