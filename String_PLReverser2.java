package tnp;
import java.util.Scanner;

public class String_PLReverser2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Question : Input :- Good
        //            Output:- GGoGooGood

        String str =sc.nextLine();
        for(int i = 0 ;i<=str.length() ; i++) {
            System.out.print(str.substring(0,i));
        }
    }
}
