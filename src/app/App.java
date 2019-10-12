package app;

public class App {
  public static void main(String[] args) throws Exception {

    String str01 = "aaabbcc";
    String str02 = "aaabbaacc";
    String str03 = "aaabbbcc";
    String str04 = "aaaccabbcc";
    String str05 = "aaaacccccabbbcc";

    myStringIsEvenWord(str01);
    myStringIsEvenWord(str02);
    myStringIsEvenWord(str03);
    myStringIsEvenWord(str04);
    myStringIsEvenWord(str05);
  }

  private static void myStringIsEvenWord(String myString) {

    System.out.println("String --> " + myString);

    char[] charArrayMyString = myString.toCharArray();

    char actualCharacter;
    int count = 0;

    for (int i = 0; i < charArrayMyString.length; i++) {

      actualCharacter = charArrayMyString[i];

      for (int j = 0; j < charArrayMyString.length; j++) {

        if (actualCharacter == charArrayMyString[j] && charArrayMyString[j] != '#') {
          charArrayMyString[j] = '#';
          count++;
        }

      }

      int resultEven = count % 2;
      boolean isEven = resultEven == 0;

      if (!isEven) {
        System.out.println("You need to remove " + resultEven + " word: (" + actualCharacter + ")");
      }

      count = 0;
      resultEven = 0;
    }
    System.out.println();

  }
}