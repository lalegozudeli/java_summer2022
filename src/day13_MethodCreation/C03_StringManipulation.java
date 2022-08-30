package day13_MethodCreation;

public class C03_StringManipulation {
    public static void main(String[] args) {
         /*
        Soru 1) String methodlarini kullanarak
                " Java ogrenmek123 Cok guzel@ " String'ini
                "Java ogrenmek cok guzel." sekline getirin.
            */
        String str= " Java ogrenmek123 Cok guzel@ ";
        str = str.replaceAll("\\d","")  //" Java ogrenmek Cok guzel@ "
                .replace(" ","x")       //"xJavaxogrenmekxCokxguzel@x"
                .replaceAll("\\W","")   //"xJavaxogrenmekxCokxguzelx"
                .replace("C","c")       //"xJavaxogrenmekxcokxguzelx"
                .replace("x"," ")       //" Java ogrenmek cok guzel "
                .trim();                                 //"Java ogrenmek cok guzel"
        System.out.println(str+".");                        //"Java ogrenmek cok guzel"
        // 2. yol hocanin cozumu
        String str1= "  Java ogrenmek123 Cok guzel@  ";
        str1=str1.trim(); // Java ogrenmek123 Cok guzel@
        str1=str1.replaceAll("\\d","");// Java ogrenmek Cok guzel@
        str1=str1.replace("@",""); // Java ogrenmek Cok guzel
        str1=str1.replace("C","c"); // Java ogrenmek cok guzel
        str1=str1+"."; // Java ogrenmek cok guzel.
        System.out.println(str1); // Java ogrenmek cok guzel.
    }
}
