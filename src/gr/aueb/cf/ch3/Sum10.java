package gr.aueb.cf.ch3;

public class Sum10 {

    public static void main(String[] args) {
        int i = 1 ;
        int sum = 0;

        while (i <= 10) {
            sum = i + sum;
            i++;
        }
        System.out.println(sum);
    }
}
