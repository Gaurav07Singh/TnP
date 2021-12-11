package practical;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            ASCII acronym for American Standard Code for Information Interchange.
             It is a 7-bit character set contains 128 (0 to 127) characters.
              It represents the numerical value of a character.
               For example, the ASCII value of A is 65.
         */

        char ch1 = 'a';
        char ch2 = 'b';

        int asciivalue1 = ch1;
        int asciivalue2 = ch2;

        System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);
        System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);
    }
}
