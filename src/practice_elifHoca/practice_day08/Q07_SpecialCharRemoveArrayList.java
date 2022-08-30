package practice_elifHoca.practice_day08;

public class Q07_SpecialCharRemoveArrayList {
      /*
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */
      public static void main(String[] args) {

          String[] arr = {"$-130", "$15", "$20"};

          System.out.println(getSum(arr));
          ;

      }
    public static int getSum(String[] arr) {
        int toplam = 0;
        for (String each : arr) {

            Integer sayi = Integer.parseInt(each.replaceAll("\\$", ""));
            toplam += sayi;
        }
        if (toplam >= 0) {
            return toplam;

        }else {
            return -1;
        }

    }
}
