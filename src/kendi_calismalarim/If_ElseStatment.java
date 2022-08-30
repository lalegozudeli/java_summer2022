package kendi_calismalarim;

import java.util.Scanner;

public class If_ElseStatment {
    public static void main(String[] args) {
        // kullanıcıdan alınan bir karakterin harf olup olmadığını yazdıran program


        Scanner scan = new Scanner(System.in);
        System.out.println("bir karakter giriniz :");
        char karakter = scan.next().charAt(0);

        if ((karakter <= 'a' && karakter >= 'z') || (karakter <= 'A' && karakter >= 'Z')){

            System.out.println("girdiğiniz karakter bir harf dir.");

        } else {
            System.out.println("girdiğiniz karakter bir harf değildir.");


        }

    }
}
