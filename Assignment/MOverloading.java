package practical;

public class MOverloading {
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {

        System.out.println(add(159,22));
        System.out.println(add(11,88,2));


    }
}
