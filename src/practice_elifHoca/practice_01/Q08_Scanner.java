package practice_elifHoca.practice_01;

import java.util.Scanner;

public class Q08_Scanner {

    public static void main(String[] args) {
        //kullanicidan 2 tam sayi alin
        // bu tam sayilari toplayin ve sonucu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 adet tam sayiyi aralarda entera basarak giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        System.out.println("Iki sayinin toplami : " + (sayi1+sayi2));
    }
}
