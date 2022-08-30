package day12_stringManipulations;

public class C02_replaceAll {

    public static void main(String[] args) {
        String str = "Bu2gu3n Ja*va- cok g3uz/el";

        //str'i Bugun Java cok guzel haline getirin
        //replaceAll() deki all'un amaci ayni ozellikteki tum karakterleri kapsamasidir.
        //butun sayilari sil
        //butun ozel karakterleri sil

        //tum ozel karakterleri silelim dedigimizde space'lerde siliniyor
        //space'leri korumak icin en basta onlarin yerine cumlede bulunmayacak
        //bir string koyalim
        //"qazwsx"

        str= str.replace(" ","qazwsx")  // bosluklari kaybetmemek icin tüm bosluklari "qazwsx" yaptik.
                .replaceAll("\\W","")   // harfler ve karakterler haricinde ki her seyi sildik.
                .replaceAll("\\d","")   // tum rakamlari sildik.
                .replace("qazwsx"," "); // kaybetmemek icin yerine "qazwsx" yazdigimiz yerleri bosluk ile
        System.out.println(str);                        // yeniden degistirdik.
    }
}
