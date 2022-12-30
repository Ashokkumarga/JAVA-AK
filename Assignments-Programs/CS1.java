import java.lang.*;
import java.util.Scanner;

public class CS1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    if (input % 7 == 0) {
      System.out.println("The given number is Divisible by 7");
    } else {
      System.out.println("The given number is not divisible by 7");
    }
  }
}
