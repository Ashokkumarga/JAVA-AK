import java.util.Scanner;

public class Greatest3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        System.out.println("Enter the Third Number");
        int c = sc.nextInt();

        if((a>b) && (a>c)){
            System.out.println("A is the Greatest Number");
        }else
        if((b>a) && (b>c)){
            System.out.println("B is the Greatest Number");
        }else{
            System.out.println("C is the Greatest Number");
        }
    }
}
