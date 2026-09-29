package chapter_13.practice.ques_06;

public class Exercise_13 {
    public static void main(String[] args) {
        int[] Counts = { 5, 37, 7435, 76, 90 };
        int[] Counts2 = Counts;
        Counts2[0] = 30;
        System.out.println(Counts[0]);

    }
}
