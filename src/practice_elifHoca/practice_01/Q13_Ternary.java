package practice_elifHoca.practice_01;

public class Q13_Ternary {

    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */

        int fiyat = 8;

        if (fiyat<10) {
            System.out.println("Ucuz");
        } else if (fiyat<20) {
            System.out.println("Normal");
        }else {
            System.out.println("Pahalı");
        }

        String sonuc = (fiyat <10) ? "Ucuz" : (fiyat<20) ? "Normal" : "Pahali";
        System.out.println(sonuc);
    }
}
