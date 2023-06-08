import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        char c ;
        String cs = "";
        int start = in.nextInt();
        int end = in.nextInt();
        for(int i=0;i<S.length();i++){
            c = S.charAt(i);
        }
        for(int j = start; j < end ; j ++){
            char cc = S.charAt(j);
            cs = Character.toString(cc);
        }
        System.out.println(cs);
    }
}