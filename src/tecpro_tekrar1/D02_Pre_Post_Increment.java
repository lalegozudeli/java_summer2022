package techpro_calisma;

public class D02_Pre_Post_Increment {

    public static void main(String[] args) {

        int a = 15;
        int b = ++a;
        System.out.println(b);
        System.out.println(a);


        int a2 = 15;
        int b2 = a2++;
        System.out.println("B :" + b2);
        System.out.println("A : " + a2);

    }
}
