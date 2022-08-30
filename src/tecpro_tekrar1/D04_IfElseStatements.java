package techpro_calisma;

import java.util.Scanner;

public class D04_IfElseStatements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        olmadigini yazdirin.
         */

        /*System.out.println("Lutfen dikdortgenin once kisa sonra uzun kenarini aralarda entera basarak giriniz.");
        double kK = scan.nextDouble();
        double uK = scan.nextDouble();

        if (kK==uK) {
            System.out.println("Sekil karedir");
        } else {
            System.out.println("Sekil kare degildir.");
        }

        /*
        Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
        olmadigini yazdirin
        */

        /*System.out.println("Lutfen bir harf giriniz.");
        char harf = scan.next().toLowerCase().charAt(0);

        if (harf >= 'a' && harf <= 'z') {
            System.out.println("Girilen karakter harftir.");
        } else {
            System.out.println("Girilen karakter harf degildir.");
        }
        /*
        Soru 3) Kullaniciya yasini sorun, eger yas 65'den kucuk ise "emekli olamazsin,
        calismalisin , 65'e esit veya buyukse "Emekli olabilirsin" yazdirin
        */
        /*System.out.println("Lutfen yasinizi giriniz.");
        int yas = scan.nextInt();

        if (yas < 65) {
            System.out.println("Emekli olamazsin " + (65 - yas) + " yil daha calisman lazim");
        } else {
            System.out.println("Emekli olabilirsin.");
        }
        /*
        Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
        birbirine esit ise ekrana "Eskenar ucgen" yazdirin. Diger durumlarda ekrana
        Eskenar degil" yazdirin.
        */

        /*System.out.println("Lutfen ucgenin kenar uzunluklarını aralarda entera basarak giriniz");
        double u1 = scan.nextDouble();
        double u2 = scan.nextDouble();
        double u3 = scan.nextDouble();

        if (u1==u2 && u2==u3) {
            System.out.println("Ucgen eskenardir.");
        } else {
            System.out.println("Ucgen eskenar degildir.");
        }

        /*
        Soru 5) Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
        isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
        gecerli degilse "Gecerli gun ismi giriniz" yazdirin
         */

        /*System.out.println("Lutfen bir gun ismi giriniz.");
        String gun = scan.next().toLowerCase();

        if (gun.equals("pazartesi")) {
            System.out.println("Paz");
        } else if (gun.equals("sali")) {
            System.out.println("Sal");
        } else if (gun.equals("carsamba")) {
            System.out.println("Car");
        } else if (gun.equals("persembe")) {
            System.out.println("Per");
        } else if (gun.equals("cuma")) {
            System.out.println("Cum");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Cum");
        } else if (gun.equals("pazar")) {
            System.out.println("Paz");
        } else {
            System.out.println("Lutfen gecerli bir gun ismi yaziniz.");
        }

        /*
        Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
        isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
        sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.
        */

        /*System.out.println("Lutfen iki sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println("pozitif iki sayının toplamı : " + (sayi1 + sayi2));
        } else if (sayi1 == 0 || sayi2 == 0) {
            System.out.println("sifir carpmaya gore yutan elemandir");
        } else if ((sayi1 > 0 && sayi2 < 0) || (sayi1 < 0 && sayi2 > 0)) {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        } else {
            System.out.println("negatif sayilarin carpimi : " + (sayi1 * sayi2));
        }

        /*
        Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not'u harf sistemine cevirip yazdirin.
        50'den kucukse "D", 50-60 arasi "C", 60-80 arasi "B", 80'nin uzerinde ise "A"
        */

        /*System.out.println("Lutfen 0'dan 100'e kadar bir not degeri giriniz.");
        double note= scan.nextDouble();

        if (note<0 || note>100) {
            System.out.println("Lutfen gecerli bir not giriniz.");
        }else if (note<50) {
            System.out.println("Notunuz : D");
        }else if (note<60) {
            System.out.println("Notunuz : C");
        }else if (note<80) {
            System.out.println("Notunuz : B");
        }else {
            System.out.println("Notunuz : A");
        }

        /*
        Soru 8) Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
        60.000'nin altinda ise "Maalesef Kabul edemem" yazdirin
        60 - 80.000 arasinda ise "Konusabiliriz",
        Teklif 80.000'in uzerinde ise "Kabul ediyorum".


        */

        System.out.println("Lutfen bir maas teklifi giriniz.");
        double maas = scan.nextDouble();

        if (maas < 60000) {
            System.out.println("Maalesef kabul edemem.");
        } else if (maas < 80000) {
            System.out.println("Konusabiliriz.");
        } else {
            System.out.println("Kabul ediyorum.");
        }


    }
}
