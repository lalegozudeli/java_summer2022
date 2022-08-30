package kendi_calismalarim;

import java.util.Scanner;

public class P04_Toplama1 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("bir sayı giriniz:");
        int m= scan.nextInt();

        System.out.println("bir sayı giriniz:");
        int n= scan.nextInt();
        int toplam= m+n;



        System.out.println("sayıların toplamı="+toplam);
    }
}
