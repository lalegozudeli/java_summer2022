package day03_scanner;

import java.util.Scanner;

public class C09_Homework {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    //   soru1:Kullanıcıdan iki tam sayı alıp bu sayıların toplam , fark ve çarpımlarını yazın.

        System.out.println(" lütfen 2 farklı tam sayı giriniz.");
         int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println("Toplam :" +(sayi1+sayi2));
        System.out.println("fark:"+(sayi1-sayi2));
        System.out.println("çarpım: "+sayi1*sayi2);



    // soru2 : kullanıcıdan karenin bir kenar uzunluğunu alın ve karenin çevresini ve alanını hesaplayıp yazdırın.


        System.out.println("lütfen karenin bir kenar uzunluğunu giriniz:");
        double kenarUzunlugu = scan.nextDouble();
        System.out.println("çevre: "+(kenarUzunlugu*4));
        System.out.println("alan: "+ (kenarUzunlugu*kenarUzunlugu));




        // soru3: kullanıcıdan yarıçap isteyip çemberin çevresini ve  alanını hesaplayıp yazdırın.


        System.out.println("lütfen çemberin yarıçapını  giriniz:");
        double yaricap= scan.nextDouble();
        double pi = 3.14 ;

        System.out.println("çemberin çevresi: "+(yaricap*2*pi));
        System.out.println("çemberin alanı: "+ (yaricap*yaricap*pi));


        // soru4: kullanıcıdan dikdörtgenler prizmasının uzun , kısa kenarlarını ve yüsekliğini isteyip prizmanın hacmini
       // hesaplayıp yazdırın.

        System.out.println(" dikdörtgenler prizmasının sırasıyla uzun,kısa kenarlarını ve yüksekliğini \n aralarında enter a basarak giriniz.");
         double uzunKenar = scan.nextDouble();
        double kisaKenar = scan.nextDouble();
        double yukseklik = scan.nextDouble();
        System.out.println("dikdörtgenler prizmansının hacmi :"+(uzunKenar*kisaKenar*yukseklik));


        // soru5: kullanıcıdan ismini ve soyismini isteyiğ aşağıdaki şekilde yazdırın.
        //isminiz : lale
        //soyadınız: gözüdeli
        //kursumuza katılımınız alınmıştır teşekkür ederiz.

        System.out.println("isminizi ve soyisminizi aralarda enter a basarak giriniz:");
                String isim = scan.nextLine();
                scan.nextLine();
                String soyisim= scan.nextLine();

                System.out.println("isminiz :" + isim + " " + "\n" + "soyisminiz:" + soyisim );
                scan.nextLine();

                System.out.println("kursumuza kaydınız alınmıştır. teşekkür ederiz.");


       // soru 6 : kullanıcıdan ismini ve soyismini alığ aralında bir boşluk oluşturarak aşağıdaki şekilde yazdıran

       //isim - soyisim: lale gözüdeli



        System.out.println("lütfen isminizi ve soyisminizi aralarda boşluk bırakarak giriniz .");
        String isim1 = scan.nextLine();
        scan.nextLine();
        String soyisim1 = scan.nextLine();
        System.out.println("isim - soyisim :"+ isim1 + " " + soyisim1 );


        /* soru 7 :kullanıcıdan ismini alıp isminin baş harfini yazdırın.

         */

        System.out.println("Lutfen isminizi giriniz");

        char ilkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println("Ismin ilk harfi : " + ilkHarf);

    }
}
