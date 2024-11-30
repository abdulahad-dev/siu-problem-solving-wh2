import java.util.Scanner;

class VowelConsonantCheck {
  public static void main(String[] args) {
    vowelOrConsonantCheck();
  }

  public static void vowelOrConsonantCheck() {
    Scanner CharacterObj = new Scanner(System.in);
    System.out.println("Enter any character plz! ");

    char character = CharacterObj.next().charAt(0);

    if (Character.isLetter(character)) {
      switch (character) {
        case 'a':
          System.out.println(character + " is vowel");
          break;
        case 'e':
          System.out.println(character + " is vowel");
          break;
        case 'i':
          System.out.println(character + " is vowel");
          break;
        case 'o':
          System.out.println(character + " is vowel");
          break;
        case 'u':
          System.out.println(character + " is vowel");
          break;
        default:
          System.out.println(character + " is consonant");
      }
    } else {
      System.out.println("The input is not a valid letter.");
    }
    CharacterObj.close();
  }
}