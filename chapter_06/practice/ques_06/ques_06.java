package chapter_06.practice.ques_06;

public class ques_06 {
    public static void main(String[] args) {
        int totalPages = 500;
        int bookMarks = 5;
        int finishedPages = totalPages - bookMarks;
        System.out.println("総ページ数：" + totalPages);
        System.out.println("しおりのページ：" + bookMarks);
        System.out.println("残りページ数：" + finishedPages);

    }
}
