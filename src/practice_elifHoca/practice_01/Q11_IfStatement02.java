package practice_elifHoca.practice_01;

public class Q11_IfStatement02 {

    public static void main(String[] args) {
        /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
        int not = 70;

        if ((not > 100 || not < 0)) {
            System.out.println("Lutfen gecerli bir not giriniz.");
        } else if (not < 60) {
            System.out.println("F");
        } else if (not < 70) {
            System.out.println("D");
        } else if (not < 80) {
            System.out.println("C");
        } else if (not < 90) {
            System.out.println("B");
        } else if (not <= 100) {
            System.out.println("A");
        }
    }
}
