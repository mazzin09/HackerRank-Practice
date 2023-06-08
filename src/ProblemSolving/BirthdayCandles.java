package ProblemSolving;

public class BirthdayCandles {
    public static int birthday(int[] candles){
//        System.out.println(candles);
        int count = 0;
        int max = 0;

        for (int i = 0; i < candles.length; i ++){
            if(candles[i] > max){
                max = candles[i];
            }
        }
//        System.out.println(max);
        for (int i = 0; i < candles.length; i ++){
            if(max == candles[i]){
                count++;
            }
        }
        System.out.println(count);
        return 1;
    }
    public static void main(String[] args) {
        int candles[] = {4,3,1,5,5};
        birthday(candles);
    }
}
