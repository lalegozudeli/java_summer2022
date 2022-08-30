package day17_nestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        // 20'den 50'ye kadar(sinirlar dahil) cift sayilari yazdiralim
        // for loop ile yapalim
        int bas=20;
        int bitis=50;
        for (int i = bas; i <=bitis ; i++) {
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        int temp=bas;
        while(temp<=bitis){
            if (temp%2==0){
                System.out.print(temp + " ");
            }
            temp++;
        }
    }
}