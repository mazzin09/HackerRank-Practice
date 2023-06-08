package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x/y);
        }
        catch(InputMismatchException ex){
            System.out.println(ex.getClass().getName());
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getClass().getName() + ": / by zero");
        }
    }
}
