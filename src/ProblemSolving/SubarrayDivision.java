package ProblemSolving;

public class SubarrayDivision {
    public static int birthday(int[] s, int d, int m) {
        int count = 0;
        for (int i = 0; i <= s.length-m; i ++){
            int sum = 0;
            for (int j = i; j < i + m; j ++){
                sum = sum + s[j];
            }
            if(sum == d){
                count++;
            }
        }
    return count;
        }
    public static void main(String[] args) {
        int[] s = {2,2,1,3,2};
        int d = 4;
        int m = 2;
        birthday(s,d,m);
    }
}
