package _2_designPatterns._1_creational.abstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        } else if (type.equalsIgnoreCase("Color")) {
            return new ColorFactory();
        }
        return null;
    }

}
