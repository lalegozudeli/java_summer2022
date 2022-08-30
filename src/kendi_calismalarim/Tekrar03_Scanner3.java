package kendi_calismalarim;

import java.util.Scanner;

public class Tekrar03_Scanner3 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("isminizi giriniz:");
        String isim= scan.nextLine();
        System.out.println("soyadınızı giriniz:");
        String soyisim= scan.nextLine();
        System.out.println("yasınızı giriniz:");
        int yas=scan.nextInt();
        System.out.println("adınız soyadınız:"+isim+" "+soyisim+"\nyasınız:"+yas);

    }
}
