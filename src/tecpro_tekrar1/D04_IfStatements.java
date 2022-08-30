package techpro_calisma;

import java.util.Scanner;

public class D04_IfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
        */

        System.out.println("Lutfen bir tamsayi giriniz.");
        int sayi = scan.nextInt();

        if (sayi%2==0) {
            System.out.println("Sayi cifttir.");
        }
        if (!(sayi%2==0)) {
            System.out.println("Sayi tektir.");
        }


        /*
        Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
        isimlerini yazdirin
        Ornek: ilkHarf=P output = "Pazar, Pazartesi veya Persembe"
        ilkHarf=S output = "Sali"
        Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */

        System.out.println("Lutfen haftanin gunlerinden herhangi birinin ilk harfini giriniz.");
        char ilkHarf = scan.next().toUpperCase().charAt(0);

        if (ilkHarf=='P') {
            System.out.println("Pazartesi, Persembe, Pazar");
        }
        if (ilkHarf=='S') {
            System.out.println("Sali");
        }
        if (ilkHarf=='C') {
            System.out.println("Carsamba, Cuma, Cumartesi");
        }

        /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek: gun=Pazar output = "Hafta sonu" gun=Sali output = "Hafta ici"
        ***String icin equals method'unu kullanin.
        */

        System.out.println("Lutfen bir gun adi giriniz.");
        String gun = scan.next().toUpperCase();

        if (gun.equals("CUMARTESI")
                || gun.equals("PAZAR")) {

            System.out.println("Hafta sonu");
        }
        if (gun.equals("PAZARTESI")
                || gun.equals("SALI")
                || gun.equals("CARSAMBA")
                || gun.equals("PERSEMBE")
                || gun.equals("CUMA")) {

            System.out.println("Hafta ici");
        }


       /*
        Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
                olmadigini yazdirin
       */

        System.out.println("Lutfen dikdortgenin once kisa sonra uzun kenarini aralarda entera basarak giriniz.");
        double kK = scan.nextDouble();
        double uK = scan.nextDouble();

        if (kK==uK) {
            System.out.println("Sekil karedir");
        }

        if (!(kK==uK)) {
            System.out.println("Sekil kare degildir.");
        }

        /*
        Soru 5) Kullanicidan bir gun alin eger gun "Cuma" ise ekrana "Muslumanlar icin kutsal
        gun" yazdirin. "Cumartesi" ise ekrana "Yahudiler icin kutsal gun" yazdirin. "Pazar"
        ise ekrana "Hiristiyanlar icin kutsal gun" yazdirin
         */
        System.out.println("Lutfen bir gun giriniz.");
        String gun2 = scan.next().toLowerCase();

        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        }


    }
}
