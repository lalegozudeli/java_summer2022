package practice_elifHoca.recap_02;

import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {


    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isim ve soyisminizi giriniz");
        String isim = scan.nextLine();
        String soyisim = scan.nextLine();
        System.out.println(isim+ " " +soyisim);
        System.out.println(isim.substring(1) + soyisim.substring(1));

    }
}