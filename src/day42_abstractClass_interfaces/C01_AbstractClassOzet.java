package day42_abstractClass_interfaces;

public class C01_AbstractClassOzet {
    /*
    Abstract Class Ozet
    1- Bir class’i abstract yapip yapmamaya bastan karar veririz.
    Eger bir class’dan obje olusturmayacaksak,
    o class’i child class’larinin uymasi gereken kurallari
    belirleyecek sekilde dizayn etmek istiyorsak, abstract class yapariz.
    2- Abstract bir class’da child class’larin mutlaka uymasi gereken kurallari
    abstract method’lar ile belirleriz.
    Abstract method’lar mutlaka child class’da override edilecegi icin body’ye ihtiyac duymaz.
    3- abstract olarak tanimlanan method’larin body’si olmaz
    4- abstract class zincirinden sonra gelen ilk concrete class,
    parent’larinda bulunan ve concrete olmayan tum method’lari override etmek ZORUNDADIR
    ancak parent abstract class’larda bulunan concrete method’lari override etmek ZORUNDA DEGILDIR.
    5- abstract bir class’in abstract child’i parent’daki abstract method’lari
    override etmek zorunda degildir.
    6- abstract class’lar constructor’a sahiptir fakat abstract class’lardan OBJE OLUSTURULAMAZ
     */
}
