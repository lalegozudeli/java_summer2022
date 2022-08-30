package day03_scanner;

public class C03_Swap2 {

    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;

        System.out.println("sayi1:"+sayi1+" "+"sayi2:"+sayi2);

        sayi1 = sayi1 + sayi2;
        sayi2= sayi1 - sayi2 ;
        sayi1 = sayi1 - sayi2;

        System.out.println("yeni sayi1:"+sayi1+" "+"yeni sayi2:"+sayi2);






    }
}
