package _2_designPatterns.facadePattern;

public class Customer {
    public static void main(String[] args) {
        ShopKeeper shopKeeper = new ShopKeeper();
        shopKeeper.getIphoneDetail();
    }
}
