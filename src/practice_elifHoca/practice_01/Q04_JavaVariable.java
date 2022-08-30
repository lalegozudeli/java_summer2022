package practice_elifHoca.practice_01;

public class Q04_JavaVariable {

    public static void main(String[] args) {

        // Initializing Variable  //variable baslangic degeri verme
        int yas = 33;
        double boy = 1.70;
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        // To copy the variable's value
        int yasim = 33;
        int enesYas = yasim;

        System.out.println("enesYas = " + enesYas);
        System.out.println("yasim = " + yasim);

        // you can declare multiple variables in the same line

        int yil = 2022, ay = 6, gun = 20;
        System.out.println("yil = " + yil);

        // updating a variable
        yil= 2032;
        System.out.println("Guncel Yil = " + yil);

        //Bir degisken tanimlayin : x
        //Baska bir degiskeni initialize edin : y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin

        int x; //Declare
        int y = 2000; // Initialize - assignment
        x = 30; // x in initialize
        y=1; // upgrade

        System.out.println("x = " + x);
        System.out.println("y = " + y);


        int a = 1;
        int b = 1;
        if (a++ < ++b) {
            System.out.print("Hello ");
        } else {
                System.out.print("Welcome ");
            }
                System.out.print("Log :"+ a + ":"+ b);

    }
}
