import java.util.Scanner;

public class EvenOdd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input % 2 ==0){
            System.out.println("The given number is even number");
        }else{
            System.out.println("The given number is Odd number");
        }
    }
}
