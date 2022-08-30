package day04_dataCasting;

public class C04_ExlicitNarrowing {
    public static void main(String[] args) {

        int sayi1= 50 ;

        byte sayi2 = (byte) sayi1;

        byte sayi3= (byte) 500;


        System.out.println(sayi2); // 50
        System.out.println("sayi3: "+sayi3); // -12

        /*
        geniş data türündeki değeri dar data türündeki variable a atamak isterseniz
        java sizin geniş data türündeki değerin, dar data türünün
        sınırlarına uyup uymayacağını çalıştırana kadar bilemez ama java risk almaz
        Riski sıfıra indirmek için burada bir sorun olursa sorumluluğu kabul etmenizi bekler.
        Bunun için değerin önüne parantez içerisinde istediğimiz data türünü yazmamız yeterlidir.

        bu riski üstlendiğimizde , 3 durum oluşabilir.

        1) bizim değerimiz  dar kalıp değerlerine uygun olursa hiç bir kayıp olmadan cast olur
        2) double bir sayıyı int a cast etmek gibi durumlarda data kaybı yaşayabilirsiniz
        3) geniş kalıptan değeri dar kalıba koyduğunuzda , sınırları aşan durumlarda veri başkalaşabilir.

         */

    }
}
