package ProblemSolving;

public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, int[] list){
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = 0;
                sum = list[i] + list[j];
                if (sum % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] list = {1,3,2,6,2,1};
        int n = 6;
        int k = 3;
        divisibleSumPairs(n,k,list);
    }
}
