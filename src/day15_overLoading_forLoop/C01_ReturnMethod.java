package day15_overLoading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        // verilen iki sayiyi carpip
        // sonucu bize donduren bir method olusturun
        int sayi1 = 10;
        int sayi2 = 5;
        int sonuc =carpGetir(sayi1,sayi2); //getirdiği değeri atamak icin bir veriablee gerek vardır.
        System.out.println("Illa da sonucu goreyim diyenlere : " + sonuc);
    }
    public static int carpGetir(int sayi1, int sayi2) {
        int sonuc= sayi1*sayi2; //olusturulan her veriable sonuc kendi bulunduğu yerde işlemdedir.
        return sonuc; //return işlemin dönüşünü sağlar. Yani sonuç methodda böyle gelir.
    }
}