package techpro_calisma;

import java.util.Scanner;

public class D03_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*
        Not Ortalaması Hesaplayan Program
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını
        kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        Ödev
        Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması
        60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
        */
        System.out.println("Lütfen sirasiyla Matematik, Fizik, Kimya, Turkce, Tarih ve Muzik notlarinizi" + "\n"+"aralarda entera basarak giriniz");
        double matematik = scan.nextDouble();
        double fizik = scan.nextDouble();
        double kimya = scan.nextDouble();
        double turkce = scan.nextDouble();
        double tarih = scan.nextDouble();
        double muzik = scan.nextDouble();
        System.out.println((matematik+fizik+kimya+turkce+tarih+muzik)/6);


        /*
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp
        ekrana bastıran programı yazın.
        (Not : KDV tutarını 18% olarak alın)
        KDV'siz Fiyat = 10;
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;
        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
                tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        */
        /*System.out.println("Lutfen kullanicidan alinan para degerini giriniz.");
        double alinanTutar = scan.nextDouble();
        double kdv= 0.18;
        double kdvliTutar = alinanTutar + (alinanTutar * kdv);
        System.out.println("Urunun Vergisiz Fiyati : " + alinanTutar+ "\n" + "Urunun KDV'li Fiyati : "+ (kdvliTutar));
        /*
        Java ile kullanıcıdan dik üçgenin dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
                𝑢 = (a+b+c) / 2
        Alan Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        */
        /*System.out.println("Lütfen dik ucgenin dik kenarlarinin uzunluklarini aralarda entera basarak giriniz");
        double kenarUzunlugu = scan.nextDouble();
        double kenarUzunlugu2 = scan.nextDouble();
        /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */
        /*System.out.println("Lütfen gidilen mesafeyi giriniz.");
        double gidilenMesafe = scan.nextDouble();
        double kmUcreti = 2.20;
        double tutar= kmUcreti*gidilenMesafe+10;
        System.out.println("Tutar : "+ tutar);*/

    }
}
