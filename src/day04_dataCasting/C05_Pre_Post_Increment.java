package day04_dataCasting;

public class C05_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi1= 10;

        int sayi2= sayi1+1; // sayi2 --> 11

        sayi2 +=5; // sayi2 -->16

        /*

        pre veya post increment/decrement
        sadece ++ ve -- işlemi için geçerlidir
        bu iki işlem için sayidan sonra veya önce yazılmasına göre farklı iki işleyiş olur

         */

        int sayi3 = sayi2++; // 1- sayi2 bir artırılacak
                            // 2- sayi2 değeri, sayi3 e atanacak


        int sayi4= ++sayi1;  // 1- sayi1 bir artırılacak
                            // 2- sayi1 değeri, sayi4 e atanacak



    }
}
