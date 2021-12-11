package practical;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str= sc.nextLine();
        char ch[]=str.toCharArray();
        String ans="";
        for(int i=ch.length-1;i>=0;i--){
            ans+=ch[i];
        }
        System.out.println(ans);
    }
}