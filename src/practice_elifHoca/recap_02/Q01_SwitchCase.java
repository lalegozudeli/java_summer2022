package practice_elifHoca.recap_02;

public class Q01_SwitchCase {

    public static void main(String[] args) {

    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
        String gun = "Pazar";

        switch (gun) {
            case "Pazartesi":
            case "Sali":
                System.out.println("Java Dersi");
                break;
            case "Carsamba":
            case "Cumartesi":
                System.out.println("SQL Dersi");
                break;
            case "Persembe":
            case "Cuma":
                System.out.println("Selenyum Dersi");
                break;
            default:
                System.out.println("Izın Gunu");
        }
    }
}