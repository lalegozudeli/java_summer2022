package day16_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // verilen bir pozptif tamsayinin
        // tam bolenlerini yazdiralim
        int input = 20;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                System.out.print(i +" ");
            }
        }
    }
}