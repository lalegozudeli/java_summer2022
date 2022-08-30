package kendi_calismalarim;
import java.util.Scanner;
public class P01_helloWorld {

    public static void main(String[] args) {
        System.out.println("hello world");


      Scanner scan= new Scanner(System.in);

        System.out.println("ne yazmamı istersin?:");
        String isim=scan.next();
        System.out.println("benden bu ismi yazdırmamı istedin:"+isim);
    }
}
