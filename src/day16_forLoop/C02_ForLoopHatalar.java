package day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {
        // 1. Hata = Başlangıc noktasında bitiş sartına yaklasmıyorsak sonsuz loop olur.
        //for (int i = 0; i >-10 ; i++) { //sonsuz kere çalışır çalıştırmamak gerekir
        System.out.println('i'); //başlangıctan bitişe doğru gidilmezse sonucu bilmediği için sonsuz şekilde döner
        //}                         //i çalısmasın diye tek tırnak yaptım yoksa yazılmamalıdır
        //2. Hata = Eğer ilk değer için bile bitiş şartı sağlanmıyorsa gorloop çalışır ama loop bodysi hiçbir zaman
        //devreye girmez..
        for (int i = 0; i >5 ; i++) { //bitiş şartı sağlanmazsa loop kırılırcve loop anlamsız olur.
            System.out.println(i);    //başlangıc int li kısım, bitiş kısmı büyük-küçük işaretinin olduğu yerdir.
        }
    }
}

