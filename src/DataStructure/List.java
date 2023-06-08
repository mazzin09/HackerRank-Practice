package DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //5
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0 ; i < n ; i ++){ // {12, 0, 1, 78, 12}
            int element = scan.nextInt();
            al.add(element);
        }
        int q = scan.nextInt(); // 2
        for (int i = 0 ; i < q ; i ++ ){
            String command = scan.next();
            if (command.equals("INSERT")){
                int x = scan.nextInt(); // 5
                int y = scan.nextInt(); // 23
                al.add(x, y); // {12, 0, 1, 78, 12, 23}
            }
            if(command.equals("DELETE")){
                int x = scan.nextInt();
                al.remove(x); // {0, 1, 78, 12, 23}
            }
        }

      for (Integer i : al){
          System.out.println(i + " ");
      }
    }
}
