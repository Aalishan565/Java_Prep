package designPatterns.facadePattern;

public class Samsung implements MobileShop {
    @Override
    public void modelName() {
        System.out.println("Samsung");
    }

    @Override
    public void modelPrice() {
        System.out.println("1000");
    }
}
