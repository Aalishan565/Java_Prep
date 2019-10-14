package designPatterns.facadePattern;

public class Iphone implements MobileShop {
    @Override
    public void modelName() {
        System.out.println("Iphone");
    }

    @Override
    public void modelPrice() {
        System.out.println("6000");
    }
}
