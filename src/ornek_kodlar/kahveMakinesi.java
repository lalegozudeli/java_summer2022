package ornek_kodlar;

import java.util.Scanner;

public class kahveMakinesi {

    static String kahve1 = "Türk kahvesi";
    static String kahve2 = "Filtre kahve";
    static String kahve3 = "Espresso";

    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("********Hoşgeldiniz********");
        String hangiKahve = "";
        String hangiBoyut = "";
        while (true) {
            System.out.println("Hangi kahveyi istersiniz?");
            System.out.println("1." + kahve1 + "\n2." + kahve2 + "\n3." + kahve3);
            hangiKahve = scan.nextLine();
            if (hangiKahve.equalsIgnoreCase(kahve1)) {
                System.out.println(kahve1 + " hazırlanıyor...");
                Thread.sleep(2000);
                break;
            } else if (hangiKahve.equalsIgnoreCase(kahve2)) {
                System.out.println(kahve2 + " hazırlanıyor...");
                Thread.sleep(2000);
                break;
            } else if (hangiKahve.equalsIgnoreCase(kahve3)) {
                System.out.println(kahve3 + " hazırlanıyor...");
                Thread.sleep(2000);
                break;
            } else {
                System.out.println("hatalı seçim yaptınız");

            }
        }
        while (true) {
            System.out.println("Süt eklememizi ister misini? \nEvet veya Hayır diye cevap veriniz ");
            String milk = scan.nextLine();
            if (milk.equalsIgnoreCase("Evet")) {
                System.out.println(milk + " ekleniyor...");
                Thread.sleep(2000);
                break;
            } else if (milk.equalsIgnoreCase("Hayır")) {
                System.out.println(milk + " eklenmiyor");
                break;
            } else {
                System.out.println("Hatalı seçim yaptınız");
            }

        }
        while (true) {
            System.out.println("Şeker ister misiniz?");
            String seker = scan.nextLine();
            if (seker.equalsIgnoreCase("Evet")) {
                System.out.println("Kaç seker istersiniz?");
                int kacSeker = scan.nextInt();
                System.out.println(kacSeker + " ekleniyor...");
                Thread.sleep(2000);
                String bosKod = scan.nextLine();
                break;
            } else if (seker.equalsIgnoreCase("Hayır")) {
                System.out.println(seker + " eklenmiyor");
                break;
            } else {
                System.out.println("Hatalı seçim yaptınız");
            }

        }
        while (true) {
            System.out.println("Hangi boyutta istersiniz?\n>Küçük - Orta - Büyük< şeklinde seçim yapınız");
            hangiBoyut = scan.nextLine();
            if (hangiBoyut.equalsIgnoreCase("Küçük")) {
                System.out.println("Kahveniz" + hangiBoyut + " hazırlanıyor...");
                Thread.sleep(2000);
                break;
            } else if (hangiBoyut.equalsIgnoreCase("Orta")) {
                System.out.println("Kahveniz" + hangiBoyut + " hazırlanıyor...");
                Thread.sleep(2000);
                break;
            } else if (hangiBoyut.equalsIgnoreCase("Büyük")) {
                System.out.println("Kahveniz" + hangiBoyut + " hazırlanıyor...");
                Thread.sleep(2000);
                break;
            } else {
                System.out.println("Hatalı seçim yaptınız");

            }
        }
        System.out.println(hangiKahve + " " + hangiBoyut + " hazırdır.\nAfiyet olsun!!!");

    }
}

