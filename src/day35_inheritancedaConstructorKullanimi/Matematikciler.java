package day35_inheritancedaConstructorKullanimi;

public class Matematikciler extends LOgretmen{
    Matematikciler(){
        System.out.println("Matematik parametresiz cons");
    }
    Matematikciler(String isim){
        this();
        System.out.println("Matematik parametreli cons");
    }
    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler("Tugba");
    }
    /*
     this() constructor call, icinde bulunulan class'daki constructorlari,
     super() ise parent class'da bulunan constructorlari cagirir
     this() veya super() parametre yapisina uygun bir constructor bulamzsa ?
     Java CTE verir
     constructor konusunda gordugumuz this.
     o class'daki instance variable'lari refere ediyordu
     inheritance'da da super. vardir
     super. parent class'daki instance'lari refere eder
     */
}
