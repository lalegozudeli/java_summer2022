package day11_stringManipulations;

import java.sql.SQLOutput;

public class C05_endsWith {

    public static void main(String[] args) {

        String str = "Ah be Java";

        System.out.println(str.endsWith("ava"));

        System.out.println(str.endsWith("be Java"));

        System.out.println(str.endsWith("Ah be Java"));

        System.out.println(str.endsWith(""));
    }
}
