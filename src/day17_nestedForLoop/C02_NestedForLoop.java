package day17_nestedForLoop;

public class C02_NestedForLoop {
    // verilen sayiya gore carpim tablosu olusturun
    /*
    input 3
    1 2 3
    2 4 6
    3 6 9
     */
    public static void main(String[] args) {
        int input=5;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println("");
        }
    }
}
