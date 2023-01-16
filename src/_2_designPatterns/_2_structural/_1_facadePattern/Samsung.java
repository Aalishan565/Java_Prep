package _2_designPatterns._2_structural._1_facadePattern;

public class Samsung implements Phone {

    @Override
    public void modelName() {
        System.out.println("Samsung");
    }

    @Override
    public void modelPrice() {
        System.out.println("1000");
    }

}
