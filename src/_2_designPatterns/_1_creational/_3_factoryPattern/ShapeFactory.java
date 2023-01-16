package _2_designPatterns._1_creational._3_factoryPattern;

public class ShapeFactory {

    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        return null;
    }

}
