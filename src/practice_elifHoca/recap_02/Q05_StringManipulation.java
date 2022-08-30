package practice_elifHoca.recap_02;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isim ve soyisminizi aralarda entera basarak giriniz.");
        String isim = scan.nextLine().toUpperCase();
        String soyisim = scan.nextLine().toUpperCase();

        System.out.println(isim + " " + soyisim);
    }
}