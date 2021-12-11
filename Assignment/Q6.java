package practical;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers ");

        int a = sc.nextInt()  , b = sc.nextInt() , c = sc.nextInt();

        System.out.println("Maximum number out of 3 numbers is: " + Math.max(a,Math.max(b,c)));
    }
}
