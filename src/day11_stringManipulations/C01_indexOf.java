package day11_stringManipulations;

public class C01_indexOf {

    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";
        // Verilen bir String'te herhangi bir string veya char'in ilk kullanildigi indexi bize dondurur.

        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("r")); // 7
        System.out.println(str.indexOf("j")); // -1

        System.out.println(str.indexOf("mek")); // 10

        // eger istedigimiz index'den sonrasini kontrol etmek istersek o zaman ayni methodu iki parametreli
        // olarak kullanabiliriz.

        System.out.println(str.indexOf("g",6)); // yazilan index'ten baslar.

        //yukaridaki str'da 2. ve 3. e'nin indexlerini bulun.
        // 2. "e"yi bulabilmek icin 1."e"nin index'ine ihtiyacim var.


        int ilkE = str.indexOf("e");
        int ikinciE= str.indexOf("e",ilkE+1);

        //eger 2."e" varsa 3. "e"nin olup olmadigini ve varsa indexini yazdiralim.

        if (ikinciE == -1) {
            System.out.println("Verilen str'da ikinci \"e\" yok");
        }else {
            int ucuncuE= str.indexOf("e",ikinciE+1);
            if (ucuncuE==-1) {
                System.out.println("Verilen str'da ucuncu \"e\" yok");
            }else{
                System.out.println("Verilen str'da ucuncu \"e\" indexi : "+ ucuncuE);
            }
        }
    }
}
