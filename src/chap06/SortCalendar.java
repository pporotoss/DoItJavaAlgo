package chap06;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.*;

public class SortCalendar {
    
    public static void main(String[] args) {
        GregorianCalendar[] calendars = {
                new GregorianCalendar(2017, NOVEMBER, 1)
                , new GregorianCalendar(1963, OCTOBER, 18)
                , new GregorianCalendar(1985, APRIL, 5)
        };
    
        Arrays.sort(calendars);
    
        for (int i = 0; i < calendars.length; i++) {
            System.out.printf("%04d년 %02d월 %02d일\n"
                    , calendars[i].get(YEAR), calendars[i].get(MONTH + 1), calendars[i].get(DATE));
        }
        
    }
    
}
