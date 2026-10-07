package PriceTag;

public class PriceTag {
    public static void main(String[] args) {
        showPrice("ノート", 500);
        showPrice("ペン", 150);
    }

    public static void showPrice(String name, int price) {
        System.out.println(name + " は " + price + " 円です");
    }
}