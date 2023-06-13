package ProblemSolving;

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2,int v2){
        String meetPoint = "NO";
        int kangarooOneDistance = x1 + v1;
        int kangarooTwoDistance = x2 + v2;
        while(kangarooOneDistance != kangarooTwoDistance){
            x1 = kangarooOneDistance;
            x2 = kangarooTwoDistance;
            kangarooOneDistance = x1 + v1;
            kangarooTwoDistance = x2 + v2;
            if (kangarooOneDistance == kangarooTwoDistance){
                meetPoint = "YES";
                break;
            }
        }
        return meetPoint;
    }
    public static void main(String[] args) {
        kangaroo(0,3,4,2);
    }
}
