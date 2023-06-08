import java.util.*;
import java.io.*;

class Solution{
    public static void main(String[] args) {
        // First query --------------------------------------
        int a = 0;
        int b = 2;
        int n = 5;
        for(int i = 1; i <= 10; i ++ ){
                a += (int) (Math.pow(2, i)*b);
                System.out.print(a + " ");
                if(i == 10){
                    System.out.println(" ");
                }
        }
        System.out.println("hello");
//        ===========================================================
        // Second query ----------------------------------------
//        int a = 5;
//        int b = 3;
//        int n = 5;
//        for (int i = 0; i <5; i++){
//            int powerOf2 = (int) Math.pow(2, i);
//            int result ;
//            result = a + powerOf2 * b;
//            a = result;
//            System.out.println(a);
//        }
//        ===========================================================
//        int a = 5;
//        int b = 3;
//        int n;
//        int sum = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of terms: ");
//        n = scanner.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            sum += Math.pow(b, i);
//            System.out.print(sum + " ");
//        }
//        in.close();
//        ==================================================
//        for(int j = 1; j <= n; j ++ ){
//            int powerOfb = (int) Math.pow((b-a), j);
//            int result ;
//            result = a + powerOfb;
//            a = result;
//            System.out.print(a + " ");
//        }
    }
}