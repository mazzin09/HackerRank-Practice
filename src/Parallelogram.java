import java.util.Scanner;

public class Parallelogram {
    static int B;
    static int H;

    static boolean flag;
     static{
        Scanner s1 = new Scanner(System.in);
         B = s1.nextInt();
         H = s1.nextInt();
         s1.close();
        if(B <= 0 || H <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
        else{
            flag = true;
        }
    }


    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
