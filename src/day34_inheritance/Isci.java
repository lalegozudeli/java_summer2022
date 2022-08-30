package day34_inheritance;

public class Isci extends Personel {
    /*
   Normal hayatimizda parent cocuk sahibi olmaya karar verebilir
   Java'da ise child class'lar ozelliklerini inherit etmek istedikleri
   class'i kendilerine parent edinirler.
   mesela isci class'ini olusturunca nelere ihtiyaci var diye dusunsek
   Personel class'indaki tum variable ve method'lara ihtiyaci
   oldugunu gorebiliriz.
   BU durumda yeniden o variable ve method'lari olusturmak yerine
   Personel class'ini kendimize parent ediniriz
   Bir class'i parent edinmek icin extends keyword kullanmaliyiz
   bir class baska bir class'i parent edindiginde
   1- parent class'daki tum ozelliklere (variable + method) otomatik olarak sahip olur
   2- Parent class'daki ozelliklerden bazilarini kendine uyarlayabilir
   3- Parent class'da olmayan bazi yeni ozellikler olusturabilir
   not: parent class'daki ozelliklerden hicbirini reddedemez ama degistirebilir
    */
    int persNo=1001;
    private String isim;

    public static void main(String[] args) {
        Isci isci1=new Isci();
        System.out.println(isci1.isim); //Isim belirtilmedi
        // kendi class'imizda isim variable yok, onun icin parent'a gideriz
        isci1.isim="Selim";
        System.out.println(isci1.persNo); // 1001 kendi class'imizda varsa onu kullaniriz
        isci1.maas(); // Isciler minumum 15 euro saat ucreti alir
    }
    public void maas(){
        System.out.println("Isciler minumum 15 euro saat ucreti alir");
    }
    public void ozelSigorta(){
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");
    }
}


