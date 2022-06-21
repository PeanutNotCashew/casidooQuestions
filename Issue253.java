/*
PROMPT:
Given a Fibonacci number, give the previous Fibonacci number. If the number given is not a Fibonacci number, return -1.
*/

import java.util.Scanner;

class Issue253 {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int input = Integer.parseInt(userInput.nextLine());

    System.out.println(nextFibNum(input));
  }

  public static int nextFibNum(int input) {
    int val1 = 1;
    int val2 = 0;
    int output = 0;

    while (output <= input) {
      output = val1 +val2;
      val2 = val1;
      val1 = output;

      if (output == input) {
        // find next value
        output = val1 +val2;
        val2 = val1;
        val1 = output;

        return output;
      }
    }
    return -1;
  }
}
