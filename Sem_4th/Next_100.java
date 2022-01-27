package tnp.Sem_4th;

public class Next_100 {
    public static void main(String[] args) {

        //  A method to return the next multiple of 100.
        // E.g = 256 --> 300 , 365 --> 400
        System.out.println(gnm(456));

    }
    static int gnm(int num) {
        return ((num/100)+1)*100;
    }
}
