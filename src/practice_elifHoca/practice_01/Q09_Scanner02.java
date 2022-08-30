package practice_elifHoca.practice_01;

import java.util.Scanner;

public class Q09_Scanner02 {

    public static void main(String[] args) {
        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word
        // nextLine() can read the whole line

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz.");
        String isim = scan.nextLine();

        System.out.println("Lutfen memleketinizi giriniz.");
        String memleket = scan.nextLine();

        System.out.println("Lutfen nerede yasadiginizi giriniz.");
        String konum = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz.");
        byte yas = scan.nextByte();

        System.out.println("Lutfen boyunuzu giriniz.");
        double boy = scan.nextDouble();

        System.out.println("Yasadiginiz " +konum+ " isimli yeri seviyor musunuz? true/false");
        boolean seviyorMu = scan.nextBoolean();

        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);

    }
}
