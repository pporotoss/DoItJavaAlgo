package chap02;

import java.util.Scanner;

public class CardConv_Ex {
    
    static int cardConv(int no, int cd, char[] cno) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int rLength = String.valueOf(cd).length();
        System.out.printf(String.format("%%2d | %%%dd\n", rLength), cd, no);
        do {
            int rest = no % cd;
            cno[digits++] = dchar.charAt(rest);
            no /= cd;
            System.out.print("   +");
            for (int i = 0; i < rLength + 4; i++) {
                System.out.print("-");
            }
            System.out.println();
    
            int restLength = String.valueOf(rest).length();
            if(no == 0) {
                System.out.printf(String.format("   | %%%dd   ...%%%dd\n", rLength + 1, restLength), no, rest);
            }
            else {
                System.out.printf(String.format("%%2d | %%%dd   ...%%%dd\n", rLength + 1, restLength), cd, no, rest);
            }
        } while (no != 0);
    
        reverse(digits, cno);
        return digits;
    }
    
    static void reverse(int digits, char[] array) {
        for (int i = 0; i < digits / 2; i++) {
            swap(array, i, digits - i - 1);
        }
    }
    
    static void swap(char[] array, int idx1, int idx2) {
        char tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
    
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int no;
            System.out.println("10진수를 기수 변환합니다.");
        
            do {
                System.out.print("변환하는 음이 아닌 정수：");
                no = scanner.nextInt();
            } while (no < 0);
            
            int cd;
            do {
                System.out.print("어떤 진수로 변환할까요? (2~36)：");
                cd = scanner.nextInt();
            } while (cd < 2 || cd > 36);
            
            char[] cno = new char[32];
            int dno = cardConv(no, cd, cno);
            System.out.print(cd + "진수로는 ");
            for (int i = 0; i <= dno; i++) {
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");
        }
    }
    
}
