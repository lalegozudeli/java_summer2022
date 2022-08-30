package day10_stringManipulation;

public class C05_length {

    public static void main(String[] args) {

        String str = "Java ogren, isi kap";

        System.out.println(str.length()); // 19 // str'in karakter sayisini dondurur.

        System.out.println(str.charAt(str.length()-1)); //son karakteri yazdiralim

        System.out.println(str.charAt(str.length()-3)); //sondan 3. karakteri yazdiralim


        /*
        Java'da null pointer(isaretleyici) bir deger degil,
        karsisina yazildigi variable'in hicbir deger almadiginin isaretcisidir.
         */


        String str2= "";     //str2'ye bir deger atanmis midir? EVET
                             // bu deger nedir? : Hiclik
        System.out.println(str2.length()); //0
        String str3 = null;  //str3'e bir deger atanmis midir? HAYIR
                             //null bu deger atamamayi isaret etmektedir.
        System.out.println(str3.length()); //bir deger atanmamis ki nasil uzunlugu olsun?

    }
}
