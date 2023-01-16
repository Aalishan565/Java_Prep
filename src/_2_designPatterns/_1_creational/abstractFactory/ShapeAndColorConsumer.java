package _2_designPatterns._1_creational.abstractFactory;

public class ShapeAndColorConsumer {

    public static void main(String[] args) {
        AbstractFactory abstractFactory=FactoryProducer.getFactory("Color");
        Color color=abstractFactory.getColor("red");
        color.fill();
    }

}
