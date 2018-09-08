package chap08;

public class KMPmatch {
    
    static int kmpMatch(String txt, String pat) {
        int pt = 1; // txt 커서
        int pp = 0; // pat 커서
        int[] skip = new int[pat.length() + 1]; // 건너뛰기 표
        
        // 건너뛰기 표 작성
        skip[pt] = 0;
        while (pt != pat.length()) {
            if(pat.charAt(pt) == pat.charAt(pp)) {
                skip[++pt] = ++pp;
            }
            else if(pp == 0) {
                skip[++pt] = pp;
            }
            else {
                pp = skip[pp];
            }
        }
    
        // 검색
        pt = 0;
        pp = 0;
        while (pt != txt.length() && pp != pat.length()) {
            if(txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            }
            else if(pp == 0) { // 한글자도 일치하지 않았으면,
                pt++; // 다음글자로 이동
            }
            else {
                pp = skip[pp]; // 일치한 글자수 만큼 이동
            }
        }
        
        if(pp == pat.length()) {
            return pt - pp;
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        String txt = "ABC이지스DEF";
        System.out.print("텍스트 : "+txt);
    
        String pat = "이지스";
        System.out.println("패턴 : "+pat);
    
        int idx = kmpMatch(txt, pat);
    
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
