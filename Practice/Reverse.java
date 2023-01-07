public class Reverse {
    public static void main(String [] args){
        String Str =" ABCD";
        String reverse = "";
        int length =Str.length();
        for(int i = length -1 ; i>=0 ;i--){
            reverse = reverse + Str.charAt(i);
        }
        System.out.println(reverse);
    }
}
