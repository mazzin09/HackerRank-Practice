package DataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contacts = scan.nextInt(); // total no of contacts
        scan.nextLine();

        Map<String, Integer> map = new HashMap<>(contacts);
        for (int i = 0; i < contacts; i ++){
            String name = scan.nextLine().trim(); //takes name
            int phone = scan.nextInt(); // takes phone number
            scan.nextLine();

            map.put(name, phone);
//            System.out.println(map);
        }
        while (scan.hasNext()){
            String query = scan.nextLine().trim(); //search name
            if(map.containsKey(query)){
                System.out.println(query + "=" + map.get(query));
            }
            else{
                System.out.println("Not Found");
            }
        }
    }
}
