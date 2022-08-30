package day14_methodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {
        // Input olarak verilen isim ve soyisimi
        // ilk harfi buyuk geriye kalan harfler * olacak sekilde
        // I****** K****** seklinde yazdiran bir method olusturun.
        String isim = "Deniz";
        String soyisim = "Taskiran";
        isimGizle(isim,soyisim);  // D**** T*******
    }
    public static void isimGizle(String isim, String soyisim) {
        isim =  isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        // ilk harfi alip buyuk yaptık geriye kalanlari * yaptık
        soyisim =soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
        // soyisim icinde ayni islemi yaptık
        System.out.println(isim + " " + soyisim);
    }
}