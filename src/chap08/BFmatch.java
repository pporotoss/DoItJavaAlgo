package chap08;

import java.util.Scanner;

public class BFmatch {
    
    static int bfMatch(String txt, String pat) {
        int pt = 0; // txt 커서
        int pp = 0; // pat 커서
    
        while (pt != txt.length() && pp != pat.length()) {
            if(txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            }
            else {
                pt = pt - pp + 1;
                pp = 0;
            }
        }
        
        if(pp == pat.length()) { // 검색 성공
            return pt - pp;
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
    
        String txt = "ABC이지스DEF";
        System.out.print("텍스트 : "+txt);
    
        String pat = "이지스";
        System.out.println("패턴 : "+pat);
    
        int idx = bfMatch(txt, pat);
        
        if(idx == -1) {
            System.out.println("텍스트에 패턴이 없습니다.");
            return;
        }
    
        int len = 0;
        for (int i = 0; i < idx; i++) {
            len += txt.substring(i, i + 1).getBytes().length;
        }
        len += pat.length();
    
        System.out.println((idx + 1)+"번째 문자부터 일치합니다.");
        System.out.println("텍스트 : "+txt);
        System.out.printf(String.format("패턴 : %%%ds\n", len), pat);
    }
    
}
