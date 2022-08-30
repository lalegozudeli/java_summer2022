package practice_elifHoca.recap_02;

public class Q07_StringManipulation {
    public static void main(String[] args) {


        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */

        String str1 = "$13.99";
        String str2 = "$10.55";

       /* str1 = str1.replace(".","x")
                .replaceAll("\\W","")
                .replace("x",".");

        str2 = str2.replace(".","x")
                .replaceAll("\\W","")
                .replace("x",".");

        double sayi = Double.parseDouble(str1);
        double sayi2 = Double.parseDouble(str2);

        System.out.println("Sayilarin toplami = " + (sayi+sayi2));*/

        str1 = str1.substring(1);
        str2 = str2.substring(1);

        double sayi = Double.parseDouble(str1);
        double sayi2 = Double.parseDouble(str2);

        System.out.println("Sayilarin toplami = " + (sayi+sayi2));

    }
}
