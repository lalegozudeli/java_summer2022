package practice_elifHoca.recap_02;

public class Q04_NestedIfandTernary {
    public static void main(String[] args) {


     /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
    */
        int sayi = 10;
        String sonuc= null;
        if (sayi >= 0 && sayi <= 9) {
            if (sayi==1) {
                sonuc= "bir";
            } else if (sayi==2) {
                sonuc="iki";
            }else if (sayi==3) {
                sonuc="uc";
            }else if (sayi==4) {
                sonuc= "dort";
            }else if (sayi==5) {
                sonuc= "bes";
            }else if (sayi==6) {
                sonuc="alti";
            }else if (sayi==7) {
                sonuc= "yedi";
            }else if (sayi==8) {
                sonuc="sekiz";
            }else if (sayi==9) {
                sonuc="dokuz";
            }else sonuc="sifir";
        }else sonuc= "gecersiz";
        System.out.println("Girilen degerin yazi karsiligi : "+sonuc);

        System.out.println(sayi==9 ? "dokuz"
                        : sayi==8 ? "sekiz"
                        : sayi==7 ? "yedi"
                        : sayi==6 ? "alti"
                        : sayi==5 ? "bes"
                        : sayi==4 ? "dort"
                        : sayi==3 ? "üc"
                        : sayi==2 ? "iki"
                        : sayi==1 ? "bir"
                        : sayi==0 ? "sifir"
                        : "gecersiz");
    }
}