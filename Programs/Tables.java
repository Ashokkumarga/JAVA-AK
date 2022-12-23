package Programs;
import java.util.*;

class Tables{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();
        int n = 10;
        for(int i = 1; i <=n ; i ++){
            table = table*i;
        System.out.println(table);
        }
    }
}
