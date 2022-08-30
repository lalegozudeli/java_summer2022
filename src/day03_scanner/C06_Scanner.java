package day03_scanner;

import javax.sound.midi.Soundbank;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");

        String isim=scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        System.out.println("girilen bilgiler = "+isim+", "+soyisim+", "+yas);

    }
}
