package day09_ternary;

import java.util.Scanner;

public class C06_SwitchCase {

    public static void main(String[] args) {

        /*
        Kullanicidan gun ismini alin
        haftaici veya haftasonu oldugunu yazdirin.
         */
        String input = "pazartesi";

        switch (input) {
            case "pazartesi":
                System.out.println("Hafta ici");
                break;
            case "sali":
                System.out.println("Hafta ici");
                break;
            case "carsamba":
                System.out.println("Hafta ici");
                break;
            case "persembe":
                System.out.println("Hafta ici");
                break;
            case "cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
                System.out.println("Hafta sonu");
                break;
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz.");

        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz");
        String gun = scan.next().toLowerCase();

            switch (gun) {
                case "pazartesi":
                case "sali":
                case "carsamba":
                case "persembe":
                case "cuma":
                    System.out.println("Hafta ici");
                break;
                case "cumartesi":
                case "pazar":
                    System.out.println("Hafta sonu");
                break;
                default:
                    System.out.println("Lutfen gecerli bir gun giriniz.");

        }
    }
}
