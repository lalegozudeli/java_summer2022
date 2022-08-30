package day29_passByValue_immutable;

import java.util.Locale;
public class C04_Immutable {
    public static void main(String[] args) {
        /*
         Immutable : degistirilemez
         mutable   : degistirilebilir
         en meshur immutable class : String
         */
        String str= "Yildiz Bank";
        System.out.println(str.toUpperCase()); // YILDIZ BANK
        str.toLowerCase();
        System.out.println(str); // Yildiz Bank
        str.substring(3,5); // sout olmadigindan yazdirmaz, di
        System.out.println(str); // Yildiz Bank
        // Java'da String gibi metin ifadelerde kullanabilecegimiz
        // mutable StringBuilder class'i da vardir
        StringBuilder sb=new StringBuilder("Java Bank");
        System.out.println(sb); // Java Bank
        sb.reverse();
        System.out.println(sb); // knaB avaJ
        sb.append(".");
        System.out.println(sb); // knaB avaJ.
    }
}

