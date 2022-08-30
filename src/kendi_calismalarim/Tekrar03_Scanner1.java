package kendi_calismalarim;

import java.util.Scanner;

public class Tekrar03_Scanner1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen bir isim giriniz:");

        String girilenisim= scan.next();

        System.out.println("isminiz: "+ girilenisim);
    }
}
