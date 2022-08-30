package kendi_calismalarim;

import java.util.Scanner;

public class If_Statments {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir gün giriniz:");
        String gun= scan.next();

        if(gun.equals("cumartesi") || gun.equals("pazar")){

            System.out.println("haftasonu");
        }else{
            System.out.println("haftaiçi");
        }
    }

}
