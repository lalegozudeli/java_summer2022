package kendi_calismalarim;

import java.util.Scanner;

public class Nested_ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz: ");
        int y= scan.nextInt();


        int sayi = (y > 5) ? (y < 10 ? 2 * y : 3 * y) : (y > 10 ? 2 + y : 3 + y);
        System.out.println(sayi);

    }
}
