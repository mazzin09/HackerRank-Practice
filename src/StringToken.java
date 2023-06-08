import java.io.*;
import java.util.*;

public class StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
//        if(s.length() == 0){
//            System.out.println(0);
//            return;
//        }
        // Write your code here.
//        for(int i = 0 ; i < s.length(); i ++ ){
//            char c = s.charAt(i);
//            System.out.println(c);
//        }
        //         aString = s.split["[^a-zA-Z]"];

        String[] aString = s.split("[^a-zA-Z]+");
        System.out.println(aString.length);
        for (String a : aString){
            System.out.println(a);
        }
        scan.close();
    }
}

