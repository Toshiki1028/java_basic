package chapter_13.section_13_2;

public class Section13_2 {
    public static void main(String[] args) {
        int first = 320;
        int copied = first;
        copied = 96;
        System.out.println(first);
        System.out.println(copied);

        int[] pageCounts = {320};
        int[] copiedArray = pageCounts;
        copiedArray[0] = 96;
        System.out.println(pageCounts[0]);
    }
}
