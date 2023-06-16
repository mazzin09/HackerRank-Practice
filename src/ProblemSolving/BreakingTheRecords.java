package ProblemSolving;

public class BreakingTheRecords {
    public static int[] breakingRecords(int[] score){
        int minimum = score[0];
        int maximum = score[0];
        int minimumCount = 0;
        int maximumCount = 0;
        for (int i = 0; i < score.length; i ++){
            if (minimum == 0 & maximum == 0){
                minimum = score[i];
                maximum = score[i];
            }
            if(minimum > score[i]){
                minimum = score[i];
                minimumCount++;
            }
            if(maximum < score[i]){
                maximum = score[i];
                maximumCount++;
            }
        }
        return new int[] {minimumCount, maximumCount};
    }
    public static void main(String[] args) {
        int score[] = {10,5,20,20,4,5,2,25,1};
        breakingRecords(score);
    }
}