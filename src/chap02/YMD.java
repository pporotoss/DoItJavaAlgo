package chap02;

import java.time.LocalDate;
import java.util.Scanner;

public class YMD {
    
    private int year;
    private int month;
    private int day;
    private LocalDate localDate;
    
    public YMD(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        localDate = LocalDate.of(year, month, day);
    }
    
    public YMD after(int n) {
        LocalDate after = localDate.plusDays(n);
        return new YMD(after.getYear(), after.getMonthValue(), after.getDayOfMonth());
    }
    
    public YMD before(int n) {
        LocalDate before = localDate.minusDays(n);
        return new YMD(before.getYear(), before.getMonthValue(), before.getDayOfMonth());
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("날짜를 입력하세요.\n");
        System.out.print("년：");
        int y = scanner.nextInt();
        System.out.print("월：");
        int m = scanner.nextInt();
        System.out.print("일：");
        int d = scanner.nextInt();
        YMD date = new YMD(y, m, d);
    
        System.out.print("몇 일 앞/뒤의 날짜를 구할까요?：");
        int n = scanner.nextInt();
        
        YMD d1 = date.after(n);
        System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.year, d1.month, d1.day);
    
        YMD d2 = date.before(n);
        System.out.printf("%d일 앞의 날짜는 %d년 %d월 %d일입니다.\n", n, d2.year, d2.month, d2.day);
    }
    
    
}
