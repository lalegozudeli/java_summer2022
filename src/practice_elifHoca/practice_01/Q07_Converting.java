package practice_elifHoca.practice_01;

import java.util.Scanner;

public class Q07_Converting {

    public static void main(String[] args) {
        /*
    galonu litreye ceviren bir java programi yaziniz
        1 gallon = 3.785 litre
    litreyi galona ceviren bir java programi yaziniz
        1 litre = 1/3.785 gallon

    // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
    // formül
    // c = (f-32)*5/9
    */
        
        int gallon = 1000;
        double litre = gallon*3.785;
        System.out.println(gallon+ " galon degeri " + litre + " litreye esittir.");

        int l = 1000;
        double g = l/3.785;
        System.out.println(l+ " litre degeri " + g + " gallona esittir.");

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen fahrenayt degerini giriniz.");
        double fh = scan.nextDouble();
        System.out.println("Girdiginiz fahrenayt degeri : "+(fh-32)*5/9+" santigrata esdegerdir.");

    }
}
