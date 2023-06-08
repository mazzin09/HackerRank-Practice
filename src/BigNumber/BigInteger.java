package BigNumber;

import java.util.Scanner;

public class BigInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            java.math.BigInteger a = new java.math.BigInteger((in.next()));
            java.math.BigInteger b = new java.math.BigInteger((in.next()));
            java.math.BigInteger c = a.add(b);
            java.math.BigInteger d = a.multiply(b);
            System.out.println(c);
            System.out.println(d);
    }
}
