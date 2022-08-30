package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe{
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;
    protected void maas(){
        System.out.println("Yan Hizmetliler : " + (30*saatUcreti*gunlukMesai)+ " maas alir");
    }
    protected void issizlikSigorta(){
        System.out.println("Yan Hizmetliler %30 indirimli issizlik sigortasi yaptirabilir");
    }
    public static void main(String[] args) {
        /*
        overriding child class'daki bir method'un
        parent class'daki ayni isimdeki methodu
        etkisiz hale getirerek
        kendisinin spesifik ozelligini ortaya cikarmasidir.
        Overriding'i nerede dikkate aliyoruz?
        bir obje olusturulurken
        data turu ve constructor farkli ise
        eger bir obje olusturulurken
        data turu ve constructor farkli ise
        objenin ozelliklerini belirlerken
        3 konuya dikkat cekmeliyiz
        1- Obje constructor'in oldugu class'da olusur
        2- objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz
           bu class'da aranan ozellik bulunamazsa parent class'lara bakilir
           ordada bulamazsak CTE verir
        3-   eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz
        aranan ozellik method ise
        degeri yazdirmadan once
        override edilmis mi diye kontrol etmemiz gerekir
        eger override edildiyse en guncel degeri yazdiriz
         */
        BMuhasebe yh1= new EYanHizmetliler();
        System.out.println(yh1.gunlukMesai); // M 8
        System.out.println(yh1.saatUcreti); // M 10
        yh1.maas(); // YH Yan Hizmetliler : 2160 maas alir
        yh1.ozelSigorta(); // M Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        yh1.sigorta(); // P Tum personelimiz sigorta yapilir
        System.out.println(yh1.isim); // P
        System.out.println(yh1.soyisim); // P
        System.out.println(yh1.departmant);// P
        // System.out.println(yh1.issizlikSigorta);
        // Aramaya muhasebeden basladigimizdan
        // issizlikSigortasi bulamadik CTE
    }
}