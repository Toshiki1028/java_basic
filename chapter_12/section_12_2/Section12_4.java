package chapter_12.section_12_2;

public class Section12_4 {
    public static void main(String[] args) {

        int[] pageCounts = { 320, 180, 480, 96, 240 };
        int thickCount = 0;
        for (int i = 0; i < pageCounts.length; i++) {
            if (pageCounts[i] >= 300) {
                thickCount++;
            }
        }
        System.out.println("300ページ以上は " + thickCount + " 冊");
    }
}