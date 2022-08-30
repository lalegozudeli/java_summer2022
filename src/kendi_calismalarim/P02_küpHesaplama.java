package kendi_calismalarim;

import java.util.Scanner;

public class P02_küpHesaplama {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Küpünü hesaplamak istediğiniz sayıyı giriniz:");
        String sayi1=scan.next();
        Integer sayi1int =Integer.parseInt(sayi1); //string sayıyı integer e çevirdik
        System.out.println("sayinin küpü="+(sayi1int*sayi1int*sayi1int));





    }
}
