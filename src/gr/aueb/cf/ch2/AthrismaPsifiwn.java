package gr.aueb.cf.ch2;

import java.util.Scanner;

public class AthrismaPsifiwn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        int leftInt, rightInt,sumTotal = 0;
        int leftLeftInt, rightRightInt = 0;

        System.out.println("Παρακαλώ εισάγετε οποιονδήποτε διψήφιο αριθμό");
        inputNum = in.nextInt();
        leftInt = inputNum / 10;
        rightInt = inputNum % 10;
        sumTotal = leftInt + rightInt;

        System.out.printf("Το άθροισμα των ψηφίων του αριθμού %d , ισούται με %d \n\n", inputNum, sumTotal);

        System.out.println("Πάμε για κάτι πιο δύσκολο, εισάγετε οποιονδήποτε τετραψήφιο αριθμό");
        inputNum = in.nextInt();
        leftLeftInt = inputNum/1000;
        leftInt = (inputNum%1000)/100;
        rightInt = ((inputNum%1000)%100)/10;
        rightRightInt = (((inputNum%1000)%100)%10);
        sumTotal = leftLeftInt + leftInt + rightInt + rightRightInt;

        System.out.printf("Το άθροισμα των ψηφίων του αριθμού %d , ισούται με %d", inputNum, sumTotal);


    }
}
