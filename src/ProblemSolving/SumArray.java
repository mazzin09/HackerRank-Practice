package ProblemSolving;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int[] array = new int[total];
        int temp = 0;

        for (int i = 0; i < total ; i ++){
            array[i] = scanner.nextInt();
            int result = temp + array[i];
            temp = result;
        }
        System.out.println(temp);
    }
}
