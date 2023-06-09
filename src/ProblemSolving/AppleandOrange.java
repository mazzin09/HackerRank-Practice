package ProblemSolving;

public class AppleandOrange {
    public static void countApplesAndOranges(int s,int t,int a,int b,int[] apples, int[] oranges){
        int countFinalApple = 0;
        int countFinalOrange = 0;
        int appleCount = 0;
        int orangeCount = 0;
        for (int i = 0; i < apples.length; i ++){
            appleCount = apples[i] + a;
            if(appleCount >= s && appleCount <= t){
                countFinalApple++;
            }
        }
        System.out.println(countFinalApple);
        for (int i = 0; i < oranges.length; i ++){
            orangeCount = oranges[i] + b;
            if(orangeCount >= s && orangeCount <= t){
                countFinalOrange++;
            }
        }
        System.out.println(countFinalOrange);

    }
    public static void main(String[] args) {
        int apples[] = {-2,2,1};
        int oranges[] = {5,-6};

        countApplesAndOranges(7,11,5,15,apples,oranges);
    }
}
