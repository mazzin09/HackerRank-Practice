package ProblemSolving;

public class MinMaxSum {
    public static void minMaxSum(int[] arr){
        long totalSum = arr[0];
        long min = arr[0];
        long max = arr[0];
        for(int i = 1; i < arr.length; i ++){
            totalSum = totalSum + arr[i];
            if(arr[i]>min){
                min = arr[i];
            }
            if(arr[i]<max){
                max = arr[i];
            }
        }
        long maxValue = totalSum-min;
        long minValue = totalSum-max;
        System.out.println(minValue + " " + maxValue);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        minMaxSum(arr);
    }
}
