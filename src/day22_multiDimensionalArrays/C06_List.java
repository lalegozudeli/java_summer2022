package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        array i array yapan sembol [] idi
        arrayList de ise <> diamond(elmas) kullanırız

       */

        List<String> isimler= new ArrayList<>();
        System.out.println(isimler); //[]

        // bir liste eleman eklemk istersek

        isimler.add("başak");


        System.out.println(isimler.add("ayşe")); //true döner
        System.out.println(isimler); // [Başak, Ayşe]

        /*
        list in tek kötü tarafı array
       alt yapısını kullandığı için elemanları birer birer eklemek orunda olmamızdır
         */

        /*
        string de bir method çalıştırdığımızda assign yapmazsak String değişmiyordu

        String isim = "Süleyman"
        isim.toUpperCase(); // SÜLEYMAN
        sout(isim)
         */
    }
}
