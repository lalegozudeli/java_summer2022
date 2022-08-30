package day42_abstractClass_interfaces;

import day21_Arrays.C01_Array_MaxSayiyiBulma;

public class K_ChildClassOfInterfaces implements I02_Interfaces,I03_Interfaces{

    private static String ISIM;

    /*
          Bir class'i bir interface'e child yapmak icin implements keyword kullanilir
          implements dedikten sonra virgul yazarak istedigimiz kadar interface ekleyebiliriz
         */
    public static void main(String[] args) {
        System.out.println(I03_Interfaces.SAYI); // 20
        System.out.println(K_ChildClassOfInterfaces.SAYI); // 30
        System.out.println(ISIM); // Yildiz Koleji
    }

    private static class SAYI {
    }
}
