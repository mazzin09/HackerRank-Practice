import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Endfile {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i = 1;
        while(s1.hasNext()){
                String test = s1.nextLine();
            System.out.println(i + " " + test);
            i++;
        }
    }
}