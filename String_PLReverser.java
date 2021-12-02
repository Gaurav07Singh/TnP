package Method;
import java.util.Scanner;

public class String_PLReverser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String res = "";

        for(int i = s.length() ; i>=0 ; i--) {
            res = s.substring(0,i) + res;
        }
        System.out.println(res);
    }
}
