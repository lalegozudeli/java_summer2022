package kendi_calismalarim;

import java.util.Scanner;

public class If_Else_Statments1 {
    public static void main(String[] args) {
        /* kullanıcıya yaşını sorun. eger yaşı 65 den büyükse
        "emekli olabilirsiniz" 65 yada daha küçük ise "emekli olamazsınız, çalışmalısınız"
        yazdırın.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yas= scan.nextInt();

        if(yas>=65){
            System.out.println("emekli olabilirsiniz");
        }else{
            System.out.println("emekli olamazsınız "+(65-yas)+ " yıl daha çalışmalısınız");
        }


    }


}
