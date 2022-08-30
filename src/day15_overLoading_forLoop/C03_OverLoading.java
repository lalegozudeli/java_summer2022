package day15_overLoading_forLoop;

public class C03_OverLoading {
    public static void main(String[] args) {
        topla(5, 7);   // 12
        topla(5.2 , 3); // 8.2
        topla(3.4,6.1);  // 9.5
    }
    public static void topla(int sayi1, int sayi2) {
        System.out.println("Iki Integer'in toplami : " + (sayi1 + sayi2));
    }
    /*
    Bir Class'da parametre sayisi ve parametre data turleri ayni olan 2 method OLUSTURAMAYIZ
    public static void topla2(int sayi3, int sayi4){
     System.out.println("Iki Integer'in toplami : "+ (sayi3+sayi4));
     */
    public static void topla(double sayi1, int sayi2) {
        System.out.println("Bir Double ve bir Integer'in toplami : " + (sayi1 + sayi2));
    }
    public static void topla(int sayi1, double sayi2) {
        System.out.println("Bİr Integer ve bir Double'in toplami : " + (sayi1 + sayi2));
    }
    public static void topla(double sayi1, double sayi2) {
        System.out.println("Iki Double'in toplami : " + (sayi1 + sayi2));
    }
}
