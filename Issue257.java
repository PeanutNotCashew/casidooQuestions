/*
PROMPT:
Given a string that has a valid email address, write a function to hide the first part of the email (before the @ sign), minus the first and last character.
*/

import java.util.Scanner;

class Issue257 {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.print("Enter email: ");
    String input = userInput.nextLine();

    System.out.println(hideEmail(input));
  }

  public static String hideEmail(String email) {
    int atSign = email.indexOf("@");
    String output = "";

    output = output.concat(String.valueOf(email.charAt(0)));
    for (int i = 1; i < atSign - 1; i++) {
      output = output.concat("*");
    }
    for (int i = atSign - 1; i < email.length(); i++) {
      output = output.concat(String.valueOf(email.charAt(i)));
    }

    return output;
  }
}
