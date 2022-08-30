package practice_elifHoca.practice_01;

import java.util.Locale;
import java.util.Scanner;

public class Q12_IfStatement03 {

    public static void main(String[] args) {
       /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen unvaninizi giriniz:");
        String jobTitle = scan.next().toLowerCase();

        if (jobTitle.equals("qa")) {
            System.out.println("Quality Analyst");
        } else if (jobTitle.equals("dev")) {
            System.out.println("Developer");
        } else if (jobTitle.equals("ba")) {
            System.out.println("Business Analyst");
        }else if (jobTitle.contains("pm")) {
            System.out.println("Project Manager");
        }else System.out.println("Lutfen gecerli bir unvan giriniz.");

        switch (jobTitle) {
            case "qa":
                System.out.println("Quality Analyst");
                break;
            case "dev":
                System.out.println("Developer");
                break;
            case "ba":
                System.out.println("Business Analyst");
                break;
            case "pm":
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("Lutfen gecerli bir unvan giriniz.");
        }
    }
}
