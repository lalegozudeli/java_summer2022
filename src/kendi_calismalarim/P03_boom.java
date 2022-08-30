package kendi_calismalarim;

public class P03_boom {

    public static void main(String[] args) {

        int sayilar[]= {1, 2, 3, 5, 6, 8, 7, 97, 5, 56, 6, 8, 8};

        boolean varMi=false;
        control(sayilar);



    }

    private static void control(int[] sayilar) {

        for (int i = 0; i < sayilar.length; i++) {


            if (sayilar[i]==7) {
                System.out.println("boom");
            }else
                System.out.println("diziniz 7 sayısı içermiyor");

        }
    }
}
