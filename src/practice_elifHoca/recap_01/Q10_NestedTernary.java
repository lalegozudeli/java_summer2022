package practice_elifHoca.recap_01;


public class Q10_NestedTernary {
    public static void main(String[] args) {
         /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

        char finalNotu = 'D';
        System.out.println(finalNotu=='A' ? "Gayet Basarili"
                         : finalNotu=='B' ? "Basarili"
                         : finalNotu=='C' ? "Ha gayret"
                         : "Digerleri");
    }
}
