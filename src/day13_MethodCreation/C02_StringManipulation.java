package day13_MethodCreation;

import java.util.Scanner;
public class C02_StringManipulation {
    public static void main(String[] args) {
       /*
        Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa "Sifre
        basari ile tanimlandi", sartlari saglamazsa "Islem basarisiz, Lutfen yeni bir
        sifre girin" yazdirin
                - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen şifrenizi giriniz");
        String sifre= scan.nextLine();
        boolean ilkHarfKontrol=sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';  // True - False
        boolean sonHarfKontrol=sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'; // True - False
        boolean spaceKontrol=!sifre.contains(" "); // True - False
        boolean uzunlukKontrol=sifre.length()>=8;  // True - False
        if (ilkHarfKontrol && sonHarfKontrol && spaceKontrol && uzunlukKontrol){
            System.out.println("Sifre basari ile tanimlandi");
        }else {
            System.out.println("Islem basarisiz,lutfen yeni bir sifre girin");
        }
        // ikinci Yontem :
        System.out.println("Lutfen bir sifre giriniz.");
        String sifre2 = scan.next();
        char ilkHarf = sifre2.charAt(0);
        char sonHarf = sifre2.charAt(sifre2.length() - 1);
        if ((ilkHarf >= 'A' && ilkHarf <= 'Z'
                && sonHarf >= 'a' && sonHarf <= 'z')
                && (!sifre2.contains(" "))
                && sifre2.length() >= 8) {
            System.out.println("Sifre gecerli.");
        } else {
            System.out.println("Sifre gecersiz.");
        }
        // 3. cozum hocanın cozumu
        System.out.println("Lütfen bir şifre giriniz");
        String sifre3=scan.nextLine();
        int kontrol=0;
        if(sifre3.charAt(0)>='A'&& sifre3.charAt(0)<='Z'){
            kontrol++;
        }else{
            System.out.println("İlk harf büyük harf olmalı");
        }
        if(sifre3.charAt(sifre3.length()-1)>='a'&&sifre3.charAt(sifre3.length()-1)<='z'){
            kontrol++;
        }else{
            System.out.println("Son harf küçük harf olmalı");
        }
        if(sifre3.contains(" ")){
            System.out.println("Şifre boşluk içermemeli");
        }else{
            kontrol++;
        }if(sifre3.length()>=8){
            kontrol++;
        }else{
            System.out.println("Sifre uzunlugu en az 8 karakter olmali");
        }
        if (kontrol==4){
            System.out.println("Sifre basari ile tanimlandi");
        }else {
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }
    }
}
