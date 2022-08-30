package techpro_calisma;

import java.util.Scanner;

public class D08_stringManipulationsHomework {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Soru 1-) String metodlarını kullanarak " Java ogrenmek123 Cok guzel@ " String'ini "Java ogrenmek cok guzel"
        sekline getirin.
         */
        /*String str = " Java ogrenmek123 Cok guzel@ ";
               str = str.replaceAll("\\d","") // " Java ogrenmek Cok guzel@ "
                        .replace(" ","x")     // "xJavaxogrenmekxCokxguzel@x"
                        .replaceAll("\\W","") // "xJavaxogrenmekxCokxguzelx"
                        .replace("C","c")     // "xJavaxogrenmekxcokxguzelx"
                        .replace("x"," ")     // " Java ogrenmek cok guzel "
                        .trim();                              // "Java ogrenmek cok guzel"
        System.out.println(str);
        /*
        Soru 2-) String şeklinde verilen aşağıdaki fiyatların toplamını bulunuz.
        -String str1 = "$13.99"
        -String str2 = "$10.55"
        ipucu= Double.parseDouble() metodunu kullanabilirsiniz.
         */
        /*String str1 = "$13.99";
        String str2 = "$10.55";
        str1 = str1.replace(".","x")
                   .replaceAll("\\W","")
                   .replace("x",".");
        str2 = str2.replace(".","x")
                .replaceAll("\\W","")
                .replace("x",".");
        System.out.println(str1);
        System.out.println(str2);

        double sayi1 = Double.parseDouble(str1); // str1 ve str2 String türündeki değişkeni double sayi
        double sayi2 = Double.parseDouble(str2); // değişkenine çevirdik.
        System.out.println(sayi1+sayi2);
        /*
        Soru 3-)Kullanicidan isim isteyin. Eger
        isim "a" harfi iceriyorsa "Girdiginiz isim a harfi iceriyor"
        isim "Z" harfi iceriyorsa "Girdiginiz isim Z harfi iceriyor"
        ikisi de yoksa "Girdiginiz isim a veya Z harfi icermiyor" yazdirin
         */
        /*System.out.println("Lutfen bir isim giriniz.");
        String isim = scan.nextLine();
        if (isim.contains("a") && isim.contains("Z")) {
            System.out.println("Girdiginiz isim iki harfide iceriyor.");
        } else if (isim.contains("a")) {
            System.out.println("Girdiginiz isim a harfi iceriyor.");
        }else if (isim.contains("Z")) {
            System.out.println("Girdiginiz isim Z harfi iceriyor.");
        }else {
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor.");
        }
        /*
        Soru 4-) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
         */
        /*System.out.println("Lutfen isminizi ve soyisminizi aralarda entera basarak giriniz.");
        String isim2 = scan.nextLine();
        String soyisim = scan.nextLine();

        System.out.println(isim2.length()<=soyisim.length() ? soyisim : isim2);
        /*
        Soru 5-) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
         */
        /*System.out.println("Lutfen 4 harfli bir kelime giriniz.");
        String kelime = scan.next();
        char harf4 = kelime.charAt(3);
        char harf3 = kelime.charAt(2);
        char harf2 = kelime.charAt(1);
        char harf1 = kelime.charAt(0);
        System.out.println("" + harf4 + harf3 + harf2 + harf1);

        String harf8 = kelime.substring(3);
        String harf7 = kelime.substring(2, 3);
        String harf6 = kelime.substring(1, 2);
        String harf5 = kelime.substring(0, 1);
        System.out.println(harf8 + harf7 + harf6 + harf5);

        /*
        Soru 6-) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa "Sifre
        basari ile tanimlandi", sartlari saglamazsa "Islem basarisiz, Lutfen yeni bir
        sifre girin" yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemel
        - Sifre uzunlugu en az 8 karakter olmali
         */
        /*System.out.println("Lutfen bir sifre giriniz.");
        String sifre = scan.next();
        char ilkHarf = sifre.charAt(0);
        char sonHarf = sifre.charAt(sifre.length() - 1);

        if ((ilkHarf >= 'A' && ilkHarf <= 'Z'
                && sonHarf >= 'a' && sonHarf <= 'z')
                && (!sifre.contains(" "))
                && sifre.length() >= 8) {
            System.out.println("Sifre gecerli.");
        } else {
            System.out.println("Sifre gecersiz.");

            /*
        Soru 7-) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
        yazdirin
        isim-soyisim : M **
        kart no :   ** 1234
         */
            String isim4 = "zeliha";
            String soyisim2 = "oznuk";
            String kartNo = "9876 5432 2525 1234";
            String isimIlkHarf = isim4.substring(0, 1).toUpperCase();
            String isimGeriyeKalan = isim4.substring(1).replaceAll("\\w", "*");
            String soyisimIlkHarf = soyisim2.substring(0, 1).toUpperCase();
            String soyisimGeriyeKalan = soyisim2.substring(1).replaceAll("\\w", "*");
            String kSonDort = kartNo.substring(15);
            String kkGeriyeKalan = "**** **** **** " + kSonDort;
            System.out.println("isim : " + isimIlkHarf + isimGeriyeKalan + "\n" +
                    "soyisim : " + soyisimIlkHarf + soyisimGeriyeKalan + "\n" +
                    "KartNo : " + kkGeriyeKalan);
        }
    }


