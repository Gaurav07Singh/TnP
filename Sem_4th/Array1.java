package kunalwstDSA.Java_Bootcamp;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

        int[] arr ={1,102,123,1452,12365};
        int[] ans = new int[arr.length];
        for(int i = 0 ; i<arr.length;i++) {
            int temp = arr[i];
            int count = 0;
            while(temp >0) {
                temp /=10;
               count++;
            }
            for(int j:ans) {
                ans[i]=count;
            }
        }
        System.out.println(Arrays.toString(ans));

    }
}
