package kendi_calismalarim;

import java.util.Scanner;

public class NestedIfElse {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi giriniz: ");
        char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.println("lütfen yaşınızı giriniz: ");
        int yas=scan.nextInt();


        if (cinsiyet=='E' && yas>=65 ) {
            System.out.println("emekli olabilirsiniz");


        } else if (cinsiyet=='K' && yas>=60 ) {
            System.out.println("emekli olabilirsiniz");

        } else{
            System.out.println("emekli olamazsınız");
        }


    }
}
