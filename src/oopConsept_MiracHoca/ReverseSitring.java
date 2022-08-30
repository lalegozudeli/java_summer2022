package oopConsept_MiracHoca;

public class ReverseSitring {

    public static void main(String[] args) {
        String name="Java Dunyasi cok guzel";

        System.out.println("reverse(name) = " + reverse(name));
    }

    public static String reverse(String name){

        String str2="";
//        String[] str=name.split("");
//        for(int i=str.length-1; i>=0 ; i--){
//            str2 =str2 + str[i];
//        }
//       */
        String[] str=name.split("");
        String tmp= "";
        for (int i = 0; i <str.length ; i++) {

            String start= str[i] ;
            String end = str[str.length-(i+1)];
            //if (start==end) break;
            tmp=start;
            start=end;
            end=tmp;
            str2=str2 +start;

        }
        return str2;
    }
}