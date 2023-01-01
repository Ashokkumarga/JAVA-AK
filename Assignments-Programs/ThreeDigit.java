import java.lang.*;
import java.util.Scanner;

public class ThreeDigit {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    if ((input > 99) && (input < 1000)) {
      System.out.println("The given number is 3 Digit Number");
    } else {
      System.out.println("The given is not a 3 digit number");
    }
  }
}
