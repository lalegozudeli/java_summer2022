package day05_matematikselIslemler;

public class C04_WrapperClass {

    public static void main(String[] args) {

        String str = "Java Cok Güzel";
        str.toUpperCase();

        int sayi = 10;
        // primitive data turlerinin yaninda metodlar olmaz.
        // Java bazi methodları kullanabilmemiz icin
        //her bir primitive data türü için bir wrapper class oluşturmuştur.

        Integer sayi2 = 10;

        sayi2.byteValue();
    }
}
