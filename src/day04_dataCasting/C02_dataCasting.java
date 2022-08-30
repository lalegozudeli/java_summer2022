package day04_dataCasting;

public class C02_dataCasting {

    public static void main(String[] args) {

        int sayi1 = 23;
        int sayi2 = 5;

        System.out.println(sayi1/sayi2); // 4.6 degil 4 --> ikisi de int olduğundan sonucu int olarak

        System.out.println(25*7/3); // 58.6666....-->58

        double sayi3=5;
        System.out.println(sayi1/sayi3); // 4.6 iki variable in data türü değişik olduğunda
                                        // daha kapsamlı olanı data türü olarak kabul olur


    }
}
