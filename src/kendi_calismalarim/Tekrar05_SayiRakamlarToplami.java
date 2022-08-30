package kendi_calismalarim;

import java.util.Scanner;

public class Tekrar05_SayiRakamlarToplami {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen 4 basamaklı bir sayı giriniz:");

        int sayi= scan.nextInt();

        int birlerbasamagi=0;
        int rakamlarToplami=0;

        birlerbasamagi= sayi%10;
       rakamlarToplami+= birlerbasamagi;
       sayi/=10;

       birlerbasamagi=sayi%10;
       rakamlarToplami+=birlerbasamagi;
       sayi/=10;

        birlerbasamagi=sayi%10;
        rakamlarToplami+=birlerbasamagi;
        sayi/=10;

        birlerbasamagi=sayi%10;
        rakamlarToplami+=birlerbasamagi;
        sayi/=10;

        System.out.println("girdiğiniz sayının rakamlar toplamı : "+rakamlarToplami);





    }
}
