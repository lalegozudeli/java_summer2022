package day03_scanner;

public class C02_Swap {

    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;

        sayi3 = sayi2 ;
        sayi2 = sayi1 ;
        sayi1 = sayi3 ;

        System.out.println("swap dan sonra sayi1 :"+sayi1);
        System.out.println("swap dan sonra sayi2 :"+sayi2);
    }


}
