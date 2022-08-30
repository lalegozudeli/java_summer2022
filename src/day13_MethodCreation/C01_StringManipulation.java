package day13_MethodCreation;

public class C01_StringManipulation {
    public static void main(String[] args) {
         /*
        Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
                String str1 = "$13.99"
                String str2 = "$10.55"
        Ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
        */
        String str1 = "$13.99";
        str1 = str1.replace(".","x").replaceAll("\\W","").replace("x",".");
        String str2 = "$10.55";
        str2 = str2.replace(".","x").replaceAll("\\W","").replace("x",".");
        System.out.println(str1);
        System.out.println(str2);
        double sayi1 = Double.parseDouble(str1); // str1 ve str2  String turundeki degiskeni double sayi degiskenine cevirdik
        double sayi2 = Double.parseDouble(str2);
        System.out.println(sayi1+sayi2);
        // 2. cozum hocanın cozdugu
        String str3 = "$13.99";
        String str4 = "$10.55";
        str3=str3.replaceAll("\\D","");
        double sayi3=Double.parseDouble(str3);
        str4=str4.replaceAll("\\D","");
        double sayi4=Double.parseDouble(str4);
        System.out.println("$"+(sayi1+sayi2)/100);
    }
}