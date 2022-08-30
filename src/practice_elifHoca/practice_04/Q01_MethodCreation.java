package practice_elifHoca.practice_04;
public class Q01_MethodCreation {

public static void main(String[]args){



    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
   birkereyazdır("aaadddvbbfghh");


   }
  private static void birkereyazdır(String str) {
      String output = ""; // string default değeri "" olduğu için aşleme etki etmesin diye bu şelkde atama yaptık

      for (int i=0;
      i < str.length();
      i++){

          if (!output.contains(str.substring(i, i + 1))) {

              output+=str.substring(i,i+1);
          }

          }
      System.out.println(output);

      }
  }