package Method;

import java.util.Scanner;

public class Serial_alpha {
    public static void main(String[] args) {

        // Question : String sorting

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        char[] s = a.toCharArray();

        for(int i =0 ; i<s.length; i++)
        {
            for(int j = i ;j<s.length ;j++)
            {
                if(s[i] > s[j])
                {
                    char temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.println(s);
    }
}
