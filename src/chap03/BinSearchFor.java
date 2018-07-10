package chap03;

import java.util.Scanner;

public class BinSearchFor {
    
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;
    
        for (int pc = (pl + pr) / 2; pl <= pr; pc = (pl + pr) / 2) {
            if(a[pc] == key) {
                return pc;
            }
            
            if(key < a[pc]) {
                pr = pc - 1;
            }
            else{
                pl = pc + 1;
            }
        }
    
        return -1;
    }
    
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in);) {
    
            System.out.print("배열 크기 : ");
            int num = scanner.nextInt();
            int[] x = new int[num];
    
            System.out.println("오름차순으로 입력하세요.");
    
            System.out.print("x[0] : ");
            x[0] = scanner.nextInt();
    
            for (int i = 1; i < num; i++) {
                do {
                    System.out.print("x[" + i + "] : ");
                    x[i] = scanner.nextInt();
                } while (x[i - 1] > x[i]);
            }
    
            System.out.print("검색할 값 : ");
            int key = scanner.nextInt();
    
            int idx = binSearch(x, num, key);
            
            if(idx == -1) {
                System.out.println("그 값의 요소가 없습니다.");
            }
            else {
                System.out.println(key + "은(는) x["+ idx +"]에 있습니다.");
            }
        }
        
    }
    
}
