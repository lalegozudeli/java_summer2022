package kendi_calismalarim;

import java.util.Scanner;

public class Nested_If_Else {
    public static void main(String[] args) {
        /*
        Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        Kullanicidan bir sifre girmesini isteyin
        Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
        Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
         */
        // ilk harf buyuk mu kucuk mu?
        // ilk harf a veya z mi?

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir şifre giriniz:");
        char sifre = scan.nextLine().charAt(0);

        if (sifre == 'A'|| sifre=='z') {
            System.out.println("geçerli şifre");
        } else if (!(sifre=='A'|| sifre=='z')) {
            System.out.println("geçersiz şifre");
        }
    }
}
