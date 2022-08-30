package practice_elifHoca.recap_02;

import java.util.Scanner;

public class Q02_SwitchCase {
    public static void main(String[] args) {
        /*
		 * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen A, B ya da C harflerinden birini giriniz.");
        char input = scan.next().toUpperCase().charAt(0);
        switch (input) {
            case 'A':
                System.out.println("Java is easy");
                break;
            case 'B':
                System.out.println("Java is fun");
                break;
            case 'C':
                System.out.println("I need to study :)");
                break;
            default:
                System.out.println("Lutfen gecerli bir harf giriniz");
        }
    }
}
