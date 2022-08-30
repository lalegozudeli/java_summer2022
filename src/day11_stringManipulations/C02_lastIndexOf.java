package day11_stringManipulations;

public class C02_lastIndexOf {

    public static void main(String[] args) {

        /*   Kullanicidan bir cümle ve bir kelime isteyin.
             kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin.
            -verilen kelime cumlede kullanilmamis.
            -verilen kelime cumlede sadece 1 kere kullanilmis
            -verilen kelime cumlede birden fazla kullanilmis.
         */
        String cumle = "Java cok kolay, Java cok guzel";
        String kelime = "Java";

        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1) {
            System.out.println("Verilen kelime cumlede kullanilmamis.");
        }else if(kelimeIlkIndex==kelimeSonIndex) {
                System.out.println("Verilen kelime cumlede sadece 1 kere kullanilmis.");
        }else {
            System.out.println("Verilen kelime cumlede birden fazla kullanilmis");

        }
    }
}
