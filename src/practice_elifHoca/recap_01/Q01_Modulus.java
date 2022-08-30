package practice_elifHoca.recap_01;
import java.util.Scanner;
public class Q01_Modulus {
    public static void main(String[] args) {


            /*
             *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
             *
             *   Ex :
             *   input  : 12345
             *   output : 12
             */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz.");
        int num = scan.nextInt();

        int ilkIki = num/1000;
        int sonIki = num%100; //100'e bölümünden kalanı verir.

        int ilkIkiTop = (ilkIki/10) + (ilkIki%10);
        int sonIkiTop = (sonIki/10) + (sonIki%10);
        System.out.println("Girilen sayinin ilk iki ve son iki rakaminin toplamlari : "+ (ilkIkiTop+sonIkiTop));


    }
    }

