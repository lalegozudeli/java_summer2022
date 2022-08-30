package techpro_calisma;

public class D07_stringManipulations {

    public static void main(String[] args) {

        //1-)concatenation();
        /*
        Birden fazla String'i birleştirerek tek bir String haline getirmek için kullanılır.

        İki şekilde kullanılır.
        */
        //- "+" operatörü ile
        String isim = "ismail";
        String soyisim = "akdogan";
        System.out.println(isim+" "+soyisim); // ismail akdogan
        //- "concat()" metodu ile
        System.out.println(isim.concat(" ").concat(soyisim)); // ismail akdogan

        //2-)charAt();
        /*
        İstenen index'teki karakteri "char" data türünde döndürür. Index 0'dan başlar.
        Maksimum index String'in uzunlugu -1'dir.(str.length()-1)
         */
        System.out.println(isim.charAt(0)); // i
        System.out.println(isim.charAt(isim.length()-1)); // l

        //3-)toUpperCase();
        /*
        Girilen String ifadedeki tüm harfleri büyük harfe çevirir.
         */
        System.out.println(isim.toUpperCase()); // ISMAIL

        //4-)toLowerCase();
        /*
        Girilen String ifadedeki tüm harfleri küçük harfe çevirir.
         */
        System.out.println(isim.toLowerCase()); //ismail
        /*
        Girilen içeriği kendi lokal dilimizde büyük yada küçük harfe çevirmek için:
        isim.toUpperCase(Locale locale);
        isim.toLowerCase(Locale locale);
         */

        //5-)equals();
        /*
        Verilen iki String ifadenin birbiriyle tamamen aynı olup olmadığını kontrol etmek amacıyla kullanılır.
        -True ya da false döner.
        (Boşluk, büyük harf, küçük harf ve özel karakter duyarlıdır.)
         */
        String isim2 = "ismail";
        String isim3 = "Ismail";

        System.out.println(isim.equals(isim2)); //true
        System.out.println(isim2.equals(isim3)); //false

        /*Equals daha çok String ifadelerin birbirine tam eşit olup olmadığını kontrol eder. Aynı işlem == ile de yapılabilir.
        Lakin == işlemi yanlış sonuç dönebilir. Sağlıklı olan String ifadeleri equals methodu ile karşılaştırmaktır.
         */

        //6-)equalsIgnoreCase();
        /*
        Verilen iki String değişkeni aralarında BÜYÜK/küçük harf farkı gözetmeksizin karşılaştırır.
        BÜYÜK/küçük harf farklılığı dışında herhangi bir karakter farklılığı olursa false döner.
         */
        String isim4 = "IsMaiL";
        String isim5 = "ISMAIL_";
        System.out.println(isim.equalsIgnoreCase(isim4)); //true
        System.out.println(isim4.equalsIgnoreCase(isim5)); //false

        //7-)length();
        /*
        Verilen String'teki karakter sayısını bize döndürür.
         */
        String isim6 = "";
        //String isim7 = null;

        System.out.println(isim.length());  // 6
        System.out.println(isim6.length()); // 0
        //System.out.println(isim7.length()); // NullPointerException

        //8-)indexOf();
        //===========>
        /*
        Verilen String'te istenilen harfi soldan sağa doğru tarayarak ilk bulduğu index'i döndürür. Büyük küçük harf
        duyarlıdır.
         */
        String cumle = "Java cok keyifli ve kolay.";
        System.out.println(cumle.indexOf("v")); //  2
        System.out.println(cumle.indexOf('z')); // -1
        System.out.println(cumle.indexOf("cok")); // 5
        System.out.println(cumle.indexOf('v',3)); // 17 // Eğer 2 parametre girersek ilk parametre aradığımız
                                                              // harfi, ikinci parametre ise aramanın hangi index'ten
                                                              // başlayacağını ifade eder.

        //9-)lastIndexOf();
        //<===============
        /*
        Verilen String'te aranan karakterin kullanıldığı son index'i bize döndürür.
        Java cok keyifli ve kolay.
         */
        System.out.println(cumle.lastIndexOf("v")); // 17
        System.out.println(cumle.lastIndexOf("keyifli")); // 9
        System.out.println(cumle.lastIndexOf("v",4)); // 2 // Eğer iki parametre girersek ilk parametre aradığımız
                                                                       // harfi, ikinci parametre ise aramanın yapılacağı index
                                                                       // sayısını sınırlar. Girilen index numarasından sonrasini
                                                                       // görmez. Harfi ya da kelimeyi girilen dizinden önce arar.
                                                                       // Aramalar sağdan sola gerçekleşir. Dizin numarası soldan sağa verilir.

        //10-)contains();
        /*
        Verilen String'in istenen karakter'i("leri") içerip içermediğini kontrol. Bize sonuç olarak true ya da false döner.

        -Parametre String olmak zorundadır.
        -Parametre metin olabilir.
        -Parametre kesinlike char olamaz. contains(); "char" ile kullanılamaz!
         Java cok keyifli ve kolay.
         */

        System.out.println(cumle.contains("a"));     //true
        System.out.println(cumle.contains("cok"));   //true
        System.out.println(cumle.contains("naber")); //false
        System.out.println(cumle.contains(""));      //true

        //11-)endsWith();
        /*
        Verilen String'in istenen karakter("ler") ile bitip bitmediğini kontrol eder. Bize sonuç olarak true ya da false döner.

        -Parametre String olmalıdır!
        -Parametre kelime olabilir.
         Java cok keyifli ve kolay.
         */
        System.out.println(cumle.endsWith("."));       //true
        System.out.println(cumle.endsWith("kolay."));  //true
        System.out.println(cumle.endsWith("z"));       //false
        System.out.println(cumle.endsWith(""));        //true

        //12-)startsWith();
        /*
        Verilen String'in istenen karakter("ler") ile başlayıp başlamadığını kontrol eder. Bize sonuç olarak true ya da false döner.
        -Parametre String olmalıdır!
        -Belirli karakterden sonrası yazılabilir.
         Java cok keyifli ve kolay.
         */

        System.out.println(cumle.startsWith(""));     //true
        System.out.println(cumle.startsWith("java")); //false
        System.out.println(cumle.startsWith("Java")); //true
        System.out.println(cumle.startsWith("J"));    //true

        //13-)isEmpty();
        /*
        Verilen String hiçbir karakter içermiyorsa true yoksa false döndürür.
        Null pointer'a eşitlenmiş variable için isEmpty(); metodu hata verecektir. Bkz: NullPointerException
         */

        String cumle2 = "";

        System.out.println(cumle.isEmpty());  //false
        System.out.println(cumle2.isEmpty()); //true

        //14-)replace();
        /*
        Verilen String'teki istenen kelime("lerin") yerine koymak istediğimiz kelimeyi("leri") yazabilmek için kullanılır.
        Kelime anlamı olarak yer değiştirmek, yenisiyle değiştirmek anlamına gelir. 2 parametre girerek yapılır. İlk parametre
        değiştirmek istediğimiz kelime ya da harfi, ikinci parametre ise yerine koymak istediğimiz kelime ya da harfi içerir.

        -Char ile char data türünü ve String ile String data türünü değiştirebilmek için kullanılır.
        -Parametrelerden birisi char diğeri String olamaz!

        Java cok keyifli ve kolay.
         */

        System.out.println(cumle.replace("ve kolay.","ama zor.")); // Java cok keyifli ama zor.
        System.out.println(cumle.replace('o','a')); // Java cak keyifli ve kalay.

        //15-)replaceAll();
        /*
        replace(); metoduna benzer olarak çalışır lakin özel komutları vardır. Tüm rakamlar ya da tüm harfleri tek bir komut ile
        işleme sokma durumu vardır. Replace metodunun aksine char data tipiyle kullanılmaz.

        Özel komutlar:
        \\s Boşluk olan kısımları değiştirir.
        \\S Boşluk dışındaki tüm karakterleri değiştirir.
        \\w Harfler ve rakamları değiştirir.
        \\W Harfler ve rakamlar harici tüm karakterleri değiştirir.
        \\d Rakamları değiştirir.
        \\D Rakamlar dışında ki tüm karakterleri değiştirir.
         */

        String str = "Bu2gu3n Ja*va- cok g3uz/el";

        //str'i Bugun Java cok guzel haline getirin
        //replaceAll() deki all'un amaci ayni ozellikteki tum karakterleri kapsamasidir.
        //butun sayilari sil
        //butun ozel karakterleri sil

        //tum ozel karakterleri silelim dedigimizde space'lerde siliniyor
        //space'leri korumak icin en basta onlarin yerine cumlede bulunmayacak
        //bir string koyalim
        //"qazwsx"

        str= str.replace(" ","qazwsx")   // bosluklari kaybetmemek icin tüm bosluklari "qazwsx" yaptik.
                .replaceAll("\\W","")    // harfler ve karakterler haricinde ki her seyi sildik.
                .replaceAll("\\d","")    // tum rakamlari sildik.
                .replace("qazwsx"," ");  // kaybetmemek icin yerine "qazwsx" yazdigimiz yerleri bosluk ile
        System.out.println(str);                           // yeniden degistirdik.


        //16-)replaceFirst();
        /*
        replace() ve replaceAll() metodlarının aksine yalnızca String içerisinde kullanıcının belirttiği ilk karakter ya da
        değeri belirlenen karakter ya da değerle değiştirir.

        -Yalnızca bir karakter değiştirir. Diğer kısımlar girilen şarta uygun olsada değiştirilmez!

         Java cok keyifli ve kolay.
        */

        System.out.println(cumle.replaceFirst("\\s","*"));     // Java*cok keyifli ve kolay.
        System.out.println(cumle.replaceFirst("\\D","*"));     // *ava cok keyifli ve kolay.
        System.out.println(cumle.replaceFirst("Java","Tava")); //Tava cok keyifli ve kolay.

        //17-)substring();
        /*
        Index kullanarak verilen String'in istenen parçasını almamızı sağlar.

        -Parametre olarak tek sayı girilirse, girilen parametreden tanımlanan String'in sonuna kadar tüm kısmı alır.
        -Parametre olarak iki sayı girilirse, girileren ilk sayıdan(dahil) son sayıya(hariç) kadar olan kısmı alır.
        -Girilen parametrelerden ilk değer ikinci değerden büyük olursa Syntax olarak herhangi bir sorun oluşmasa da
         işlem exception fırlatır.

         Java cok keyifli ve kolay.
         */

        System.out.println(cumle.substring(9));   // keyifli ve kolay
        System.out.println(cumle.substring(9,14));         // keyif
        //System.out.println(cumle.substring(28));  // OutOfBoundException

        //18-)trim();
        /*
        İstediğimiz String'in başında veya sonunda var olan boşlukları siler.
         */
        String str2 = "  Java bomba, bizler citir  ";
        System.out.println(str2);               //Boşluklu hali
        System.out.println(str2.length());
        System.out.println(str2.trim());        //Boşluklar silindi.
        System.out.println(str2.trim().length());








    }
}