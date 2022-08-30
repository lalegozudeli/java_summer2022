package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class C01_TimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih : " + tarihSaat);
        // ilk olusturulan tarih : 2022-07-25T20:40:33.824375300
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/M/yy  hh:mm a");
        System.out.println(dtf1.format(tarihSaat)); // 25/7/22  08:45
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yyyy  HH:mm a");
        System.out.println(dtf2.format(tarihSaat)); // 25/Jul/2022  20:46
    }
}
