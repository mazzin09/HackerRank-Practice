package ProblemSolving;

public class GradingStudents {
    public static int gradingStudents(int[] grades){
        int dividend = 0;
        int remainder = 0;
        int divisor = 5;
        int accuracy = 0;
        for (int i = 0; i < grades.length; i ++){
            if(grades[i] > 35){
                dividend = grades[i];
                remainder = dividend % divisor;
                if(remainder >= 3){
                    accuracy = divisor - remainder;
                    grades[i] = grades[i] + accuracy;
                    System.out.println(grades[i]);
                }
                else{
                    System.out.println(grades[i]);
                }
            }
            else{
                System.out.println(grades[i]);
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int grades[] = {73, 67, 38, 33};
        gradingStudents(grades);
    }
}
