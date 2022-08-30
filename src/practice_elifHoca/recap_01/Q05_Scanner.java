package practice_elifHoca.recap_01;

import java.util.Scanner;

public class Q05_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
        System.out.println("a sayisini giriniz.");
        double a = scan.nextDouble();
        System.out.println("b sayisini giriniz.");
        double b = scan.nextDouble();
        System.out.println("c sayisini giriniz.");
        double c = scan.nextDouble();

        double sonuc = ((a*a)-(b*b))/(c*3);
        System.out.println(sonuc);
    }
}
