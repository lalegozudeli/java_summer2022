package kendi_calismalarim;

import java.util.Scanner;

public class Tekrar03_Scanner2 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen birinci sayıyı giriniz:");
        double sayi1= scan.nextDouble();
        System.out.println("lütfen ikinci sayıyı giriniz:");
        double sayi2= scan.nextDouble();

        System.out.println("girilen sayıların çarpımı:"+ sayi1*sayi2);

    }
}
