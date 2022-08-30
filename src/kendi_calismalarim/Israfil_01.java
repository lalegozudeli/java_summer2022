package kendi_calismalarim;

public class Israfil_01 {
    public static void main(String[] args) {
        String s1=" Araba";
        String s2="ArAbA";
        String s3="araba";

       // if (s1.equals(s2)){

       // }
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.trim().equalsIgnoreCase(s2));
    }
}
