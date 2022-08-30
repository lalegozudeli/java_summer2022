package day07_ifStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_BasitIfStatement {

    public static void main(String[] args) {

        /*
        soru 3-) Kullanicidan gun ismini alin ve haftaici  veya haftasonu oldugunu yazdirin.
        Ornek :     gun =´Pazar output = "Hafta Sonu"
                    gun = Sali  output=   "Hafta ici"

                    *** String icin equals method'unu kullanin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz.");
        String girilenGUN = scan.next().toLowerCase();
        // Pazar, pazar, PAZAR, PaZar, PAzar ??? bilemeyiz,
        // pazar ,pazar, pazar, pazar, pazar

        if (girilenGUN.equals("cumartesi") || girilenGUN.equals("pazar")) {
            System.out.println("Girilen gun HAFTASONU");
        }

        if      (girilenGUN.equals("pazartesi")
                || girilenGUN.equals("sali")
                || girilenGUN.equals("carsamba")
                || girilenGUN.equals("persembe")
                || girilenGUN.equals("cuma")) {
            System.out.println("Girilen gun HAFTAICI");
        }

        if      (!(girilenGUN.equals("pazartesi")
                || girilenGUN.equals("sali")
                || girilenGUN.equals("carsamba")
                || girilenGUN.equals("persembe")
                || girilenGUN.equals("cuma")
                || girilenGUN.equals("cumartesi")
                || girilenGUN.equals("pazar"))) {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }

    }
}
