package day12_stringManipulations;

public class C04_substring {
    public static void main(String[] args) {

        String str= "Java cok yasa";

        System.out.println(str.substring(3,4)); //a

        System.out.println(str.substring(5,7)); //co

        System.out.println(str.substring(6,6)); //"" hiclik

        System.out.println("====");

        System.out.println(str.substring(6,2)); // OutOfBoundException
    }
}
