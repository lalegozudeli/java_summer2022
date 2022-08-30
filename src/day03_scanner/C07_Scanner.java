package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi,soyisminizi ve yasinizi giriniz aralarda Enter tusuna basiniz");
        String isim= scan.nextLine();
        scan.nextLine();
        String soyisim = scan.nextLine();
        scan.nextLine();

        int yas = scan.nextInt();
        System.out.println(isim + " " + soyisim + " " + yas);

    }
}
