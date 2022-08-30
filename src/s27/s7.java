package s27;

public class s7 {

    /*
    Soru 7-) Klavyeden okunan bir karakterin (char) küçük harf olduğunun kontrolünü yaparak,
             bu harfin büyük harf karşılığını ekrana yazdıran programı Java dilinde yazınız.
     */

    public static void main(String[] args) {
        double input=1500;
        double kdvFiyat= input*0.18;
        double satisFiyati= kdvFiyat+input;

        System.out.println(input + " tl fiyatlı urunun kdv si "+kdvFiyat+" "+ "ve kdvli satiş fiyatı"+satisFiyati+"tl dir");

        }
    }

