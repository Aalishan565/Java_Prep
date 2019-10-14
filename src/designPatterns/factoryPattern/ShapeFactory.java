package designPatterns.factoryPattern;

public class ShapeFactory {
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("ractangle")) {
            return new Ractangle();
        } else if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        return null;
    }
}
