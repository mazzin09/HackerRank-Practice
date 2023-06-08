package DataStructure;

import java.util.List;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        List<List<Integer>> listsOfList = new java.util.ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5 lines
        for (int i = 0; i < n; i++){
            int d = sc.nextInt(); // 5 data
            List<Integer> list = new java.util.ArrayList<>();
            for (int j = 0; j < d; j ++){
                list.add(sc.nextInt()); // {41, 77, 74, 22, 44}
            }
            listsOfList.add(list);
        }

        int q = sc.nextInt(); // 5 query
        for (int i = 0 ; i < q; i ++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            try{
                System.out.println(listsOfList.get(x-1).get(y-1));
            }
            catch (Exception ex){
                System.out.println("ERROR!");
            }
        }
    }
}
