package practice_elifHoca.recap_01;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {
    public static void main(String[] args) {
        /*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz.");
        int yas = scan.nextInt();

        System.out.println("Lutfen kilonuzu giriniz.");
        double kilo = scan.nextDouble();

        if (yas>0 && yas<18) {
            System.out.println("Kan bagisi yapamazsiniz.");
        }else if (yas>18) {
            if (kilo > 0 && kilo < 50) {
                System.out.println("Kan bagisi yapamazsiniz.");
            } else System.out.println("Kan bagisi yapabilirsiniz.");

        }
    }
}
