package chapter_14.practice.ques_07;

public class Exercise14_Q7 {
    public static void main(String[] args) {
        double average = calculateAverage(10, 20);
        System.out.println("平均は " + average + " です");
    }

    private static double calculateAverage(int first, int second) {
        return (first + second) / 2.0;
    }
}
