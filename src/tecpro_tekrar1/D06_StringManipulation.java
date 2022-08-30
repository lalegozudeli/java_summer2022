package techpro_calisma;

import java.util.Scanner;

public class D06_StringManipulation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*
        Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
        olmadigini yazdirin
        */
        /*System.out.println("Lutfen bir cumle giriniz.");
        String cumle = scan.nextLine().toLowerCase();
        System.out.println("Lutfen bir harf giriniz.");
        char harf = scan.next().toLowerCase().charAt(0);
        if (cumle.indexOf(harf)>=0) {
            System.out.println("Girilen karakter cumlede var");
        } else {
            System.out.println("Girilen karakter cumlede yok.");
        }
        /*
        Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
        kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin

        - Girilen kelime cumlede kullanilmamis.
        - Girilen kelime cumlede 1 kere kullanilmis.
        - Girilen kelime cumlede l'den fazla kullanilmis.
         */
        System.out.println("Lutfen bir cumle giriniz.");
        String cumle = scan.nextLine().toLowerCase();
        System.out.println("Lutfen bir kelime giriniz.");
        String kelime = scan.next().toLowerCase();

        int ilkKelime= cumle.indexOf(kelime); // indexOf bize index veya -1 dondurur
        int ikinciKelime = cumle.indexOf(kelime,ilkKelime+1);  // +1 yazarak bulunan kelimeden sonrasina bakiyoruz
        if (ilkKelime == (-1)){ // kullanicidan istedigimiz icin olumsuz'undan yole cikmaliyiz
            System.out.println("Girilen kelime cumlede kullanilmamis");
        }else if (ikinciKelime ==(-1)){ // bir ust'deki if'den kurlursa burasi calisacak ve buda girilen kelime cumlede var demektir
            // ayni -1 taktigiyle burasi calisirsa 1 tane var demek yoksa eger else'ye duser ve kelimenin 1'den fazla kullanildigi ortaya cikar
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        }else {
            System.out.println("Girilen kelime cumlede 1'den fazla kullanilmis");
        }
    }
}

