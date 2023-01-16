package _2_designPatterns._2_structural.facadePattern;

public class Iphone implements Phone {

    @Override
    public void modelName() {
        System.out.println("Iphone");
    }

    @Override
    public void modelPrice() {
        System.out.println("6000");
    }

}
