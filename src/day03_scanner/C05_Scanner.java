package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("lütfen ilk sayiyi girin");

        double sayi1=scan.nextDouble();
        System.out.println("lütfen ikinci sayıyı giriniz");
        double sayi2=scan.nextDouble();
        System.out.println("girilen sayiların çarpımı :"+sayi1*sayi2);



    }

}
