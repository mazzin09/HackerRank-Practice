package ProblemSolving;

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2,int v2){
        String meetPoint = "NO";
       if(v1 <= v2){
           return meetPoint;
       }
       else{
           while (x1 < x2){
               x1 = x1 + v1;
           }
           while (x2 > x1){
               x2 = x2 + v2;
           }
           if(x1 == x2){
               meetPoint = "YES";
               return meetPoint;
           }
            else{
                return meetPoint;
           }
       }
    }
    public static void main(String[] args) {
        kangaroo(21,6,47,3);
    }
}
