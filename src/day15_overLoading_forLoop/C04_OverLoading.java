package day15_overLoading_forLoop;

public class C04_OverLoading {
    public static void main(String[] args) {
        topla(5, 7);   // 12
        topla(5.2, 3); // 8.2
        topla(3.4, 6.1);  // 9.5    ---->> Argumnet
        topla(5, 6.2); //
    }
    /*
    Java hangi method'un calisacagina karar verirken optimizasyon yapar
    - eger hic cast yapmadan kullanabilecegi bir method varsa onu kullanir
    - eger cast yapmadan kullanacagi bir method yoksa, en az cast yaparak kullanabilecegi
      method'u tercih eder
     */
    public static void topla(int sayi1, int sayi2) {
        System.out.println("Iki Integer'in toplami : " + (sayi1 + sayi2));
    }
    //  ---->>>> Parametre ()' icindekiler
    public static void topla(double sayi1, int sayi2) {
        System.out.println("Bir Double ve bir Integer'in toplami : " + (sayi1 + sayi2));
    }
    //  ---->>>> Parametre ()' icindekiler
    public static void topla(double sayi1, double sayi2) {
        System.out.println("Iki Double'in toplami : " + (sayi1 + sayi2));
    }
    //  ---->>>> Parametre ()' icindekiler
}
