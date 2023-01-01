import java.util.Scanner;

public class PosNeg {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if( input >=0 ){
            System.out.println("Postive Number");
        }else{
            System.out.println("Negative Number");
        }
    }
}
