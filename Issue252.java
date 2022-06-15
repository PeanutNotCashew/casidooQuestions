/*
PROMPT:
Create a loooong teeeext generator that takes in a string and an integer "n", and multiplies the vowels in the string by "n".
*/

import java.util.Scanner;
import java.util.Arrays;

class Issue252 {
  static char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = userInput.nextLine();
    System.out.print("Enter a number: ");
    int num = Integer.parseInt(userInput.nextLine());

    System.out.println(longText(input, num));
  }

  public static String longText(String input, int num) {
    String output = "";
    int inputLength = input.length();

    for (int i = 0; i < inputLength; i++) {
      char character = input.charAt(i);

      if (search(character) < 0) {
        String appendText = output.concat(String.valueOf(character));
        output = appendText;
      } else {
        for (int j = 0; j < num; j++) {
          String appendText = output.concat(String.valueOf(character));
          output = appendText;
        }
      }
    }
    return output;
  }

  public static int search(char toFind){
    return Arrays.binarySearch(VOWELS, toFind);
  }
}
