package day11_stringManipulations;

import java.util.Scanner;

public class C03_contains {

    public static void main(String[] args) {
        /*
            Soru 1) Kullanicidan email adresini girmesini isteyin,
            mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
            @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
            @gmail.com ile bitmiyorsa lutfen yazimi kontrol edin yazdirin
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz.");
        String eMail= scan.nextLine();

        if (!eMail.contains("@gmail.com")) {
            System.out.println("Lutfen gmail adresi giriniz.");
        }else if (eMail.lastIndexOf("@gmail.com")==(eMail.length()-10)) {
            System.out.println("E-mail adresiniz kaydedildi.");
        }else {
            System.out.println("Lutfen yazimi kontrol edin.");
        }
    }
}
