package ProblemSolving;

import java.util.Scanner;

public class PlusMinusDemo {
    public static void main(String[] args) {
        float plus = 0;
        float minus = 0;
        float zero = 0;
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int[] array = new int[total];
        for (int i = 0; i < total; i++ ){
            array[i] = scanner.nextInt();
            if(array[i] > 0){
               plus++;
            }
            if(array[i] < 0){
                minus++;
            }
            if(array[i] == 0){
                zero++;
            }
        }
        double minusResult =(minus/total);
        double plusResult = (plus/total);
        double zeroResult = (zero/total);
        System.out.println(minusResult);
        System.out.println(plusResult);
        System.out.println(zeroResult);
    }
}
