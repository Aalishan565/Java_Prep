package _2_designPatterns.abstractFactory;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("ractangle")) {
            return new Ractangle();
        } else if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        return null;
    }
}
