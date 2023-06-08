import java.io.*;
import java.util.*;

public class StringIntro {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int L = A.length()+B.length();
        System.out.println(L);
        int lex = A.compareTo(B);
        if(lex < 0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        String Au = A.substring(0,1).toUpperCase()+A.substring(1);
        String Bu = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(Au + " " + Bu);

    }
}



