package kendi_calismalarim;

import java.util.Scanner;

public class Tekrar03_Scanner4 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen adınızı giriniz:");
        String isim= scan.nextLine();
        isim.charAt(0);
        System.out.println("adınızın bas harfi:"+isim.charAt(0));



    }
}
