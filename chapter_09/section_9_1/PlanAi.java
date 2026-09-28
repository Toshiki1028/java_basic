package chapter_09.section_9_1;

public class PlanAi {
    public static void main(String[] args) {
        int totalPages = 480;
        int dayCount = 10;

        if (dayCount > 0) {
            System.out.println("1日あたり " + (totalPages / dayCount) + " ページです");
        } else {
            System.out.println("日数が0なので、1日あたりのページ数は出せません");
        }
        int pages = 320;
        int goal = 300;
        System.out.println(pages == goal);
        System.out.println(pages != goal);
        System.out.println(pages > goal && goal >= 300);
        System.out.println(pages >= goal || goal == 0);
        System.out.println(pages < goal);
    }
}
