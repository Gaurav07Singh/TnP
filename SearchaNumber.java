package Method;
import java.util.Scanner;

public class SearchaNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter array size");
        int size = sc.nextInt();

        System.out.println("Enter array items");
        int a[] =  new int[size];
        for(int i = 0 ; i<size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int target= sc.nextInt();

        for(int i = 0 ;i<a.length ; i++) {
            if (a[i] == target) {
                System.out.println(i);
            }
        }
    }
}
