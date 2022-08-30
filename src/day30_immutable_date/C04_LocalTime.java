package day30_immutable_date;

import java.time.LocalTime;
public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1=LocalTime.now();
        System.out.println(time1); // 18:12:03.362192
        /*
         Bizim olusturdugumuz date ve time
         canli saat veya tarih degildir
         LocalTime.now(); kullandigimiz satirda
         o anki tarih veya saati alip
         bizim variable'imiza store eder.
         time1 variable'inin degeri SABITTIR
         */
        Thread.sleep(3000);
        time1=LocalTime.now();
        System.out.println(time1); //
        System.out.println(time1.getSecond()); // 32
        System.out.println(time1.plusSeconds(10000)); // 21:18:12.631502800
        System.out.println(time1.minusMinutes(200)); // 15:13:59.829050300
        System.out.println(time1.withHour(3)); // saati 3 yapip yazdirdi
    }
}