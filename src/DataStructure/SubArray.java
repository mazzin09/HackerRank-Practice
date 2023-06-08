package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalElement = scanner.nextInt(); // 5
        int[] subArray = new int[totalElement];
        int count = 0;
        for (int i = 0; i < totalElement; i ++ ){
            subArray[i] = scanner.nextInt(); // {1, -2, 4, -5, 1}
        }
        for (int i = 0; i < subArray.length; i++){
            int sum = 0;
            for (int j = i; j < subArray.length; j++ ){
                sum = sum + subArray[j];
                if(sum < 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
