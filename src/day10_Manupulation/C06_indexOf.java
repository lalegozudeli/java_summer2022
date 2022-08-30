package day10_stringManipulation;

public class C06_indexOf {

    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";


        System.out.println(str.indexOf("o")); //5
        System.out.println(str.indexOf('g')); //6
        System.out.println(str.indexOf("t")); //bana integer donduruyor
                                              //int'te yok diye bir deger bulunmuyor.
                                              // 0 dersek J'nin index'idir.
                                              //- bir deger donerse biz aranan String'in str'da olmadigini anlariz.
                                              // Java -1 dondurmeyi tercih etmistir.

        String str5 ="tqwequyweuqweoııqwrqwuıeqweıoq";

        //str5'te p harfi var midir?

        if (str5.indexOf("=")==-1) {
            System.out.println("Str5'te istenen karakter kullanilmamistir");
        } else {
            System.out.println("Str5'te istenen karakter kullanilmis");
        }
    }
}
