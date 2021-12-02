package Method;
import java.util.Scanner;

public class Max_MinOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter size of Array ");

        int size = sc.nextInt();
        System.out.println("Input array");
        int[] arr = new int[size];

        for(int i = 0 ; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i = 0 ; i< arr.length ; i++) {
            if(max < arr[i]) {
                int temp = arr[i];
                arr[i]=max;
                max = temp;

            }

        }
        System.out.println("Max : "+ max);
        int min = arr[0];
        for(int i = 1 ; i< arr.length ; i++) {
            if(min > arr[i]) {
                int temp = arr[i];
                arr[i]=min;
                min = temp;

            }

        }
        System.out.println("Min : "+ min);
    }
}
