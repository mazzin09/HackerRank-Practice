package ProblemSolving;

public class MigratoryBirds {
    public static int migratoryBirds(int[] array){
        int fixArray[] = new int[5];
        for (int i = 0; i < array.length; i ++){
            fixArray[array[i]-1]++;
        }
        int maximum = 0;
        int answer = 0;
        for (int i = 0; i < fixArray.length; i ++){
            if (fixArray[i] > maximum){
                maximum = fixArray[i];
                answer = i + 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] array = {1,4,4,4,2,3};
        migratoryBirds(array);
    }
}
