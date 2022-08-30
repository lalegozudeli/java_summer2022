package practice_elifHoca.recap_01;

import java.util.Scanner;

public class Q07_BMISiniflama {
    public static void main(String[] args) {
        /*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30>BMI ==> Obez grubundasiniz.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu cm olarak giriniz.");
        double boy = scan.nextDouble()/100;

        System.out.println("Lutfen agirliginizi kilo olarak giriniz.");
        double agirlik = scan.nextDouble();
        
        double bmi = agirlik/(boy*boy);
        System.out.println("bmi = " + bmi);
        
        if (bmi<=20) {
            System.out.println("Bmi endeksiniz "+bmi +" ldukca zayifsiniz");
        } else if (bmi<=25) {
            System.out.println("Bmi endeksiniz " + bmi + " normal sinirlardasiniz");
        } else if (bmi<=30) {
            System.out.println("Bmi endeksiniz " + bmi + " sisman kategorisindesiniz");
        }else if (bmi>30) {
            System.out.println("Bmi endeksiniz " + bmi + " obez grubundasiniz.");
        }
    }
}
