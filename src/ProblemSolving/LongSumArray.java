package ProblemSolving;

import java.util.Scanner;

public class LongSumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        long[] array = new long[total];
        long temp = 0;

        for (int i = 0; i < total ; i ++){
            array[i] = scanner.nextInt();
            long result = temp + array[i];
            temp = result;
        }
        System.out.println(temp);
    }
}
