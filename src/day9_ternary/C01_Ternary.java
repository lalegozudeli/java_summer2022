package day9_ternary;

import java.util.Scanner;

public class C01_Ternary {

    public static void main(String[] args) {
        //soru 3 kullanıcıdan bir sayı alın ve sayının mutlak değerini yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz:");
        double sayi = scan.nextDouble();
        System.out.println("girdiğiniz sayının mutlak değeri:"+(sayi>=0 ? sayi:(-1*sayi)));
    }
}
