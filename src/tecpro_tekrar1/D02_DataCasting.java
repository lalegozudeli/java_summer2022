package techpro_calisma;

public class D02_DataCasting {

    public static void main(String[] args) {

        /*
        Soru 1 ) byte veri tipinde bir degisken olusturun, short, int,float ve double data tiplerinde
        birer degisken olusturup adim adim widening yapin ve yazdirin
        */
        byte num1 = 16;
        short num2 = num1;
        System.out.println("num2 = " + num2);
        int num3 = num2;
        System.out.println("num3 = " + num3);
        float num4 = num3;
        System.out.println("num4 = " + num4);
        double num5 = num4;
        System.out.println("num5 = " + num5);
        /*
        Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
        */
        int num6 = 98547;
        short num7 = (short) num6;
        System.out.println("num7 = " + num7);
        byte num8 = (byte)num7;
        System.out.println("num8 = " + num8);
        /*
        Soru 3 ) Float data turunde bir variable olusturun ve yazdirin
        */
        float num9 = 13.8f;
        System.out.println("num9 = " + num9);
        /*
        Soru 4 ) double 255.36 sayisini int'a ve sonra da olusturdugunuz int sayiyi byte'a cevirip
        yazdirin
         */
        double num10 = 255.36;
        int num11 = (int)num10;
        System.out.println("num11 = " + num11);
        byte num12 = (byte)num11;
        System.out.println("num12 = " + num12);
        /*
        Soru 5 ) int 2 sayiyi birbirine boldurun ve sonucu yazdirin
         */
        int num13 = 1608320658;
        int num14 = 25;
        System.out.println("num13/num14 = " + num13/num14);
        /*
        Soru 6 ) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
        */
        int num15 = 580632;
        double num16 = 12.5;
        System.out.println("num15/num16 = " + num15/num16);
        /*
        Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim
        */
        float num17 = 104.4f;
        int num18 = 17;
        System.out.println("num17*num18 = " + num17/num18);

        char num19 = 's';
        double num20 = 43.5;
        System.out.println("(num19+num20) = " + (num19+num20));
        System.out.println("num19*num20 = " + num19*num20);
    }
}
