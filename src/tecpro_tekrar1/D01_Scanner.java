package techpro_calisma;

import java.util.Scanner;

public class D01_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Soru 1-) Kullanıcıdan 3 tane tam sayı isteyip bunların toplamını yazdırınız.
        System.out.println("Lütfen 3 farklı tam sayı giriniz.");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        System.out.println("Sayıların Toplamı = " + (num1 + num2 + num3));

        /*
            Soru 2-) Kullanıcıdan arabasının markasını, modelini ve model yılını belirten girdi isteyip bunları;

            Marka : Ford
            Model : Focus
            Model Yılı : 2013  şeklinde yazdırınız.
         */
        System.out.println("Lütfen arabanızın marka,model ve model yılını aralarda entera basarak giriniz.");
        String marka = scan.nextLine();
        scan.nextLine();
        String model = scan.nextLine();
        scan.nextLine();
        String modelYili = scan.nextLine();

        System.out.println("Marka : " + marka + "\n" + "Model : " + model + "\n" + "Model Yılı : " + modelYili);
        /*
            Soru 3-) Çalışandan ürün fiyatını girmesini isteyerek %18 KDV'li fiyatı otomatik olarak hesaplayan
            programı yazınız ve aşağıda ki şekilde çıktı alınız.

                    Ürünün KDV'li Fiyatı : 123 TL
         */
        System.out.println("Lütfen ürünün vergisiz fiyatını giriniz.");
        double kdv = 0.18;
        double fiyat = scan.nextDouble();
        System.out.println("Ürünün KDV'li fiyatı = " + (kdv*fiyat+fiyat));

    }
}
