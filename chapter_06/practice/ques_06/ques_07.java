package chapter_06.practice.ques_06;

public class ques_07 {
    public static void main(String[] args) {
        int okashi = 21;
        int friend = 4;
        int hitoriatari = okashi / friend;
        int amari = okashi % friend;
        System.out.println("一人当たりのお菓子の数" + hitoriatari + "つ");
        System.out.println("余ったお菓子の数" + amari + "つ");
    }
}
