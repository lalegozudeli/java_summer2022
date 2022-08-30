package techpro_calisma;

import java.util.Scanner;

public class D05_Ternary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        Soru1 ) Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        */
        System.out.println("Lutfen iki sayi giriniz");
        double sayi = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println(sayi2>sayi ? sayi : sayi2);
        /*
        Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
        */
        System.out.println("Lutfen bir tamsayi giriniz.");
        int sayi3 = scan.nextInt();

        System.out.println(sayi3%2==0 ? "cift sayidir" : "tek sayidir");
        /*
        Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
        */
        System.out.println("Lutfen bir sayi giriniz.");
        double sayi4 = scan.nextDouble();
        System.out.println(sayi4>=0 ? sayi4 : (-1*sayi4));
        /*
        Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse "Sayi pozitif" yazdirin, negatifse
        sayinin karesini yazdirin
         */
        System.out.println("Lutfen bir sayi yazın");
        int sayi5 = scan.nextInt();

        System.out.println(sayi5>0  ? "sayi pozitif" : sayi5*sayi5);

        /*
        Soru5 ) Kullanicidan dikdortgenin uzunlugu ve genisligini alin, girilen degerlere
            gore dikdortgenin kare olup olmadigini yazdirin
        */
        System.out.println("Lutfen dikdortgenin kisa ve uzun kenar degerini aralarda entera basarak giriniz.");
        double kK = scan.nextDouble();
        double uK = scan.nextDouble();

        System.out.println(kK==uK ? "kare" : "kare degil");

        /*
        Soru6 ) Kullanicidan bir sayi alin ve sayi 3 basamali ise "uc basamakli sayi",
         degilse "uc basamakli degil" yazdirin
        */
        System.out.println("Lutfen bir sayi giriniz.");
        int num = scan.nextInt();

        System.out.println(num>99 && num<1000 ? "sayi 3 basamakli" : "sayi 3 basamakli degildir");
    }
}
