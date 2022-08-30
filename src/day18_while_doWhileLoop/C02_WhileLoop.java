package day18_while_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
         /*
        Soru 7 ) Kullanicidan bir sayi alin
        ve bu sayinin rakamlari toplamini yazdirin
         */

        int input= 54321;

        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=input;

        while(temp>0){
            birlerBasamagi = temp%10;
            rakamlarToplami += birlerBasamagi;
            temp /= 10;

            System.out.printf(input + " sayısının rakamlar toplamı :"+rakamlarToplami);
        }
    }

}
