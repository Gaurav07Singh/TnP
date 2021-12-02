package Method;

public class MinOf3Nums {
    public static void main(String[] args) {
        System.out.println(minNum(152,2800,336));

    }
    static int minNum(int a , int b , int c) {
        int max = Math.min(a , (Math.min(b , c)));
        return max;

    }
}
