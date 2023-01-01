import java.util.Scanner;

public class Multiple{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input % 3 == 0){
            System.out.println("The given number is multiple of 3");
        }else{
            System.out.println("Not Multiple of 3");
        }
    }
}