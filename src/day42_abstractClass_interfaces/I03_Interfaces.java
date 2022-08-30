package day42_abstractClass_interfaces;

public interface I03_Interfaces {
    int SAYI=20;
     /* int sayi;
        interface'lerde tum variable'lar public static ve final'dir
        dolayisiyla sonradan deger atama sansimiz yoktur
        bunun icin variable olusturdugumuzda mutlaka deger atamaliyiz
        Bir interface bir class'i parent edinemez
      */
    /*
       Interface icerisindeki her method
       public ve abstract  ozelliklerine sahiptir
       abstract bir method'un body'si olmasi mumkun degildir
       Java sonradan developer'larin istegi uzerine
       kismi bir update yapmistir.
       Bir interface'e sonradan bir abstract method eklerseniz
       o interface'i daha once implement etmis tum class'lara gidip
       hepsinde yeni eklenen method'u override etmeniz gerekir
       Bu da buyuk ve eskiden gelen projeler icin cok zor bir islemdir.
       Bunun icin Java Java8'den itibaren
       interface'lere sonradan body'si olan method eklenmesine izin vermistir.
       Bu method'larin body'si olsa da Interface'in yapisi geregi
       bu method'lara concrete denmez
       body'si olan bu method'lar istisna olarak kabul edilebilir.
     */
}
