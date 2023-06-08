import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram2 {

    static boolean isAnagram(String a, String b) {
        if(a.length() == b.length()){
            a = a.replace(" ","").toLowerCase();
            b = b.replace(" ","").toLowerCase();

            char [] charA = a.toCharArray();
            char [] charB = b.toCharArray();

            Arrays.sort(charA);
            Arrays.sort(charB);

            boolean result = Arrays.equals(charA, charB);
            if(result){
                System.out.println("Anagrams");
                return true;
            }
         else{
                System.out.println("Not Anagrams");
                return false;
            }
        }
        else{
            System.out.println(" Anagrams");
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        isAnagram(a, b);
        // boolean ret = isAnagram(a, b);
        // System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
