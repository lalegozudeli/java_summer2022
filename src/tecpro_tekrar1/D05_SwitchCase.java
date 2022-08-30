package techpro_calisma;

import java.util.Scanner;

public class D05_SwitchCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        Soru1 : Kullaniciya haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin
        */
        System.out.println("Lutfen haftanin kacinci gunu oldugunu giriniz.");
        byte gun = scan.nextByte();

        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lutfen gecerli bir sayi giriniz.");

        }
        /*
        Soru2 : Kullanicidan kacinci ay oldugunu isteyin ve ay ismini yazdirin
        */
        System.out.println("Lutfen kacinci ayda oldugunuzu giriniz.");
        byte ay = scan.nextByte();

        switch (ay) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Lutfen gecerli bir sayi giriniz.");

        }
        /*
        Soru3 : Kullanicidan bir sayi girmesini isteyin
        Girilen sayi
        10 ise "Iki basamakli en kucuk sayi
        100 ise "uc basamakli en kucuk sayi"
        1000 ise "dort basamakli en kucuk sayi"
        diger durumlarda "Girdigin sayiyi degistir" yazdirin
        */
        System.out.println("Lutfen bir sayi giriniz.");
        short sayi = scan.nextShort();

        switch (sayi) {
            case 10:
                System.out.println("Iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("Uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("Dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Girdigin sayiyi degistir.");
        }
        /*
        Soru4 : Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
        Kullanici S girerse "Software"
        D girerse "Developer"
        E girerse "Engineer"
        T girerse "In Testing" yazdirin
        */
        System.out.println("Lutfen SDET harflerinden birini giriniz.");
        char harf = scan.next().toUpperCase().charAt(0);

        switch (harf) {
            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Lutfen yukaridaki harflerden birini giriniz.");


            /*
            Soru5 : Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
            */
                System.out.println("Lutfen bir gun giriniz");
                String gun2 = scan.next().toLowerCase();

                switch (gun2) {
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
}
