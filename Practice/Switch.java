import java.util.*;

public class Switch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();
    switch (button){
        case 1:
        System.out.println("Hello");
        break;

        case 2:
        System.out.println("Namste");
        break;

        case 3:
        System.out.println("Namste");
        break;

        default :
        System.out.println("Invalid button");
    }
  }

  
}


// if(button == 1){
//     System.out.println("Hello");
// }else{
//     if(button == 2){
//         System.out.println("Namaste");
//     }else{
//         if(button == 3){
//             System.out.println("Bonjour");
//         }else{
//             System.out.println("Invalid Button");
//         }
//     }
// }