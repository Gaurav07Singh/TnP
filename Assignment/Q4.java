package practical;

public class Q4 {
    public static void main(String[] args) {

        // Largest element of an array

        int[] arr= { 1,85,26,33,452,13,22,0,2,365,233};
        System.out.println(max(arr));
    }
    static int max(int[] arr) {

        int max = arr[0];
        for(int i = 1 ; i<arr.length ;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
